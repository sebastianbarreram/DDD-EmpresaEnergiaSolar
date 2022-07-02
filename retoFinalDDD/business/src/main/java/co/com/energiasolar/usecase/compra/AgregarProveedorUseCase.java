package co.com.energiasolar.usecase.compra;

import co.com.energiasolar.compra.Compra;
import co.com.energiasolar.compra.commands.AgregarProveedor;
import co.com.energiasolar.diseño.Diseño;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AgregarProveedorUseCase extends UseCase<RequestCommand<AgregarProveedor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarProveedor> agregarIngenieroRequestCommand) {
        var command = agregarIngenieroRequestCommand.getCommand();
        var diseño= Compra.from(
                command.getCompraId(),repository().getEventsBy(command.getCompraId().value())
        );
        diseño.agregarProveedor(command.getEntityId(),command.getNombre(),command.getCompraId());

        emit().onResponse(new ResponseEvents(diseño.getUncommittedChanges()));
    }
}
