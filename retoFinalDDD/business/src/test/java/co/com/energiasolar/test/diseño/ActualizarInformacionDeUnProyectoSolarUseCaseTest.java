package co.com.energiasolar.test.diseño;

import co.com.energiasolar.diseño.commands.ActualizarInformacionDeUnProyectoSolar;
import co.com.energiasolar.diseño.commands.ActualizarNombreDeUnIngeniero;
import co.com.energiasolar.diseño.events.*;
import co.com.energiasolar.diseño.values.*;
import co.com.energiasolar.usecase.diseño.ActualizarInformacionDeUnProyectoSolarUseCase;
import co.com.energiasolar.usecase.diseño.ActualizarNombreDeUnIngenieroUseCase;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class ActualizarInformacionDeUnProyectoSolarUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    ActualizarInformacionDeUnProyectoSolarUseCase useCase;

    @Test
    public void cuandoSeActualizaLaInformacionDeUnProyectoSolar() {
        //arrange
        ProyectoSolarId entityId= ProyectoSolarId.of("13");
        Informacion informacion = new Informacion("4 paneles solares");
        DiseñoId diseñoId=DiseñoId.of("26");
        var command=new ActualizarInformacionDeUnProyectoSolar(entityId,informacion,diseñoId);
        when(repository.getEventsBy(diseñoId.value())).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events= UseCaseHandler
                .getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(InformacionDeUnProyectoSolarActualizada)events.get(0);
        Assertions.assertEquals("4 paneles",event.getInformacion().value());
    }

    private List<DomainEvent> history() {
        return List.of(
                new DiseñoCreado(DiseñoId.of("13"), new Sede("Medellin"))
                , new ProyectoSolarAgregado(ProyectoSolarId.of("26"),
                        new Informacion("1 panel solar"),
                        DiseñoId.of("13")
                )
        );
    }


}