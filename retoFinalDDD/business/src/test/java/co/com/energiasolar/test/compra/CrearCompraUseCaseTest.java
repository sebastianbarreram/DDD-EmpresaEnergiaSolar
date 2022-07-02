package co.com.energiasolar.test.compra;

import co.com.energiasolar.compra.commands.CrearCompra;
import co.com.energiasolar.compra.events.CompraCreada;
import co.com.energiasolar.compra.values.CompraId;
import co.com.energiasolar.usecase.compra.CrearCompraUseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class CrearCompraUseCaseTest {
    @InjectMocks
    CrearCompraUseCase useCase;

    @Test
    public void cuandoSeCreaUnaCompra() {
        //arrange
        var command = new CrearCompra(
                CompraId.of("595")
        );

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (CompraCreada)events.get(0);
        Assertions.assertEquals("595", event.getEntityId().value());

    }

}