package co.com.energiasolar.usecase.cotizacion;

import co.com.energiasolar.cotizacion.Cotizacion;
import co.com.energiasolar.cotizacion.commands.ActualizarNombreDeUnCliente;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarNombreDeUnClienteUseCase extends UseCase<RequestCommand<ActualizarNombreDeUnCliente>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreDeUnCliente> actualizarNombreDeUnClienteRequestCommand) {
        var command = actualizarNombreDeUnClienteRequestCommand.getCommand();
        var cotizacion = Cotizacion.from(
                command.getCotizacionId(), repository().getEventsBy(command.getCotizacionId().value())
        );
        cotizacion.actualizarNombreDeUnCliente(command.getEntityId(), command.getNombre());

        emit().onResponse(new ResponseEvents(cotizacion.getUncommittedChanges()));
    }
}

