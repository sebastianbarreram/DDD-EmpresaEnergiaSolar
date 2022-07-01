package co.com.energiasolar.test.diseño;

import co.com.energiasolar.diseño.commands.CrearDiseño;
import co.com.energiasolar.diseño.events.DiseñoCreado;
import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.diseño.values.Sede;
import co.com.energiasolar.usecase.diseño.CrearDiseñoUseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CrearDiseñoUseCaseTest {
    @InjectMocks
    CrearDiseñoUseCase useCase;

    @Test
    public void cuandoSeCreaUnDiseño() {
        //arrange
        var command = new CrearDiseño(
                DiseñoId.of("12"),
                new Sede("Medellin"));

        //act
        var events =UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (DiseñoCreado)events.get(0);
        Assertions.assertEquals("Medellin", event.getSede().value());

    }

}
