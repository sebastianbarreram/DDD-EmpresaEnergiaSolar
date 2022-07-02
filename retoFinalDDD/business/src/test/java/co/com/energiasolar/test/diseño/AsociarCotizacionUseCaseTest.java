package co.com.energiasolar.test.diseño;

import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.diseño.commands.AsociarCotizacion;
import co.com.energiasolar.diseño.commands.CrearDiseño;
import co.com.energiasolar.diseño.events.CotizacionAsociada;
import co.com.energiasolar.diseño.events.DiseñoCreado;
import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.diseño.values.Sede;
import co.com.energiasolar.usecase.diseño.AsociarCotizacionUseCase;
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
class AsociarCotizacionUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @InjectMocks
    AsociarCotizacionUseCase useCase;

    @Test
    public void cuandoSeAsociaUnaCotizacionAUnDiseño() {
        //arrange
        DiseñoId diseñoId = DiseñoId.of("12");
        CotizacionId cotizacionId = CotizacionId.of("24");

        var command = new AsociarCotizacion(cotizacionId, diseñoId);
        when(repository.getEventsBy(diseñoId.value())).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events= UseCaseHandler
                .getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(CotizacionAsociada)events.get(0);
        Assertions.assertEquals("24",event.getCotizacionId().value());
    }

    private List<DomainEvent> history() {
        return List.of(
                new DiseñoCreado(DiseñoId.of("12"), new Sede("Medellin"))
        );
    }
}