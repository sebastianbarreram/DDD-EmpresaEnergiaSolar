package co.com.energiasolar.test.cotizacion;

import co.com.energiasolar.cotizacion.commands.ActualizarNombreDeUnCliente;
import co.com.energiasolar.cotizacion.events.ClienteAgregado;
import co.com.energiasolar.cotizacion.events.CotizacionCreada;
import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.cotizacion.values.Direccion;
import co.com.energiasolar.diseño.events.NombreDeUnIngenieroActualizado;
import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.energiasolar.usecase.cotizacion.ActualizarNombreDeUnClienteUseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ActualizarNombreDeUnClienteUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @InjectMocks
    ActualizarNombreDeUnClienteUseCase useCase;

    @Test
    public void cuandoSeActualizaElNombreDeUnCliente() {
        //arrange
        ClienteId entityId= ClienteId.of("123456789");
        Nombre nombre = new Nombre("Diana");
        CotizacionId cotizacionId=CotizacionId.of("26");
        var command=new ActualizarNombreDeUnCliente(entityId,nombre,cotizacionId);
        when(repository.getEventsBy(cotizacionId.value())).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events= UseCaseHandler
                .getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(NombreDeUnIngenieroActualizado)events.get(0);
        Assertions.assertEquals("Diana",event.getNombre().value());
    }

    private List<DomainEvent> history() {
        return List.of(
                new CotizacionCreada(CotizacionId.of("12"))
                , new ClienteAgregado(ClienteId.of("123456789"),
                        new Direccion("Carrera 1 #2 sur 3"),
                        new Nombre("Santiago"),
                        CotizacionId.of("26")
                )
        );
    }


}