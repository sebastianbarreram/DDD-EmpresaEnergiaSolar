package co.com.energiasolar.test.diseño;

import co.com.energiasolar.diseño.commands.ActualizarNombreDeUnIngeniero;
import co.com.energiasolar.diseño.commands.CambiarSede;
import co.com.energiasolar.diseño.events.DiseñoCreado;
import co.com.energiasolar.diseño.events.NombreDeUnIngenieroActualizado;
import co.com.energiasolar.diseño.events.SedeCambiada;
import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.diseño.values.IngenieroId;
import co.com.energiasolar.diseño.values.Nombre;
import co.com.energiasolar.diseño.values.Sede;
import co.com.energiasolar.usecase.diseño.CambiarSedeUseCase;
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
public class CambiarSedeUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @InjectMocks
    CambiarSedeUseCase useCase;

    @Test
    public void cuandoSeCambiaLaSedeDeUnDiseño() {
        //arrange
        DiseñoId diseñoId=DiseñoId.of("26");
        Sede sede=new Sede("Cali");
        var command=new CambiarSede(sede,diseñoId);
        when(repository.getEventsBy(diseñoId.value())).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events= UseCaseHandler
                .getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(SedeCambiada)events.get(0);
        Assertions.assertEquals("Cali",event.getSede().value());
    }

    private List<DomainEvent> history() {
        return List.of(
                new DiseñoCreado(DiseñoId.of("12"), new Sede("Medellin"))

        );
    }


}