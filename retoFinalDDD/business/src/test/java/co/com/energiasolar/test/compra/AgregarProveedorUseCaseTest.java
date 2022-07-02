package co.com.energiasolar.test.compra;

import co.com.energiasolar.compra.commands.AgregarProveedor;
import co.com.energiasolar.compra.events.CompraCreada;
import co.com.energiasolar.compra.events.ProveedorAgregado;
import co.com.energiasolar.compra.values.CompraId;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.energiasolar.compra.values.Nombre;
import co.com.energiasolar.usecase.compra.AgregarProveedorUseCase;
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
class AgregarProveedorUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    AgregarProveedorUseCase useCase;

    @Test
    public void cuandoSeAgregaUnProveedorAUnaCompra() {
        //arrange
        CompraId compraId = CompraId.of("12");
        ProveedorId proveedorId = ProveedorId.of("123456789");
        Nombre nombre = new Nombre("Sebastian");

        var command=new AgregarProveedor(proveedorId,nombre,compraId);
        when(repository.getEventsBy(compraId.value())).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events= UseCaseHandler
                .getInstance()
                .syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event=(ProveedorAgregado)events.get(0);
        Assertions.assertEquals("Sebastian",event.getNombre().value());

    }

    private List<DomainEvent> history() {
        return List.of(
                new CompraCreada(CompraId.of("12"))
        );
    }


}