package co.com.energiasolar.test.cotizacion;

import co.com.energiasolar.cotizacion.commands.CrearCotizacion;
import co.com.energiasolar.cotizacion.events.CotizacionCreada;
import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.usecase.cotizacion.CrearCotizacionUseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CrearCotizacionUseCaseTest {
    @InjectMocks
    CrearCotizacionUseCase useCase;

    @Test
    public void cuandoSeCreaUnDiseño() {
        //arrange
        var command = new CrearCotizacion(
                CotizacionId.of("595")
        );

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (CotizacionCreada)events.get(0);
        Assertions.assertEquals("595", event.getEntityId().value());

    }

}