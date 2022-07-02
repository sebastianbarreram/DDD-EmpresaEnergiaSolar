package co.com.energiasolar.usecase.compra;


import co.com.energiasolar.compra.Compra;
import co.com.energiasolar.compra.commands.CrearCompra;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearCompraUseCase extends UseCase<RequestCommand<CrearCompra>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCompra> crearCompraRequestCommand) {
        var command = crearCompraRequestCommand.getCommand();
        var compra=new Compra(
                command.getEntityId());
        emit().onResponse(new ResponseEvents(compra.getUncommittedChanges()));
    }
}

