package co.com.energiasolar.usecase.diseño;

import co.com.energiasolar.diseño.Diseño;
import co.com.energiasolar.diseño.commands.ActualizarNombreDeUnIngeniero;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;


public class ActualizarNombreDeUnIngenieroUseCase extends UseCase<RequestCommand<ActualizarNombreDeUnIngeniero>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarNombreDeUnIngeniero> actualizarNombreDeUnIngenieroRequestCommand) {
        var command = actualizarNombreDeUnIngenieroRequestCommand.getCommand();
        var diseño= Diseño.from(
                command.getDiseñoId(),repository().getEventsBy(command.getDiseñoId().value())
        );
        diseño.actualizarNombreDeUnIngeniero(command.getEntityId(),command.getNombre());

        emit().onResponse(new ResponseEvents(diseño.getUncommittedChanges()));
    }
}
