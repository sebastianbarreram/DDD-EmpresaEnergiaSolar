package co.com.energiasolar.usecase.diseño;

import co.com.energiasolar.diseño.Diseño;
import co.com.energiasolar.diseño.commands.ActualizarInformacionDeUnProyectoSolar;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarInformacionDeUnProyectoSolarUseCase extends UseCase<RequestCommand<ActualizarInformacionDeUnProyectoSolar>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ActualizarInformacionDeUnProyectoSolar> actualizarInformacionDeUnProyectoSolarRequestCommandRequestCommand) {
        var command = actualizarInformacionDeUnProyectoSolarRequestCommandRequestCommand.getCommand();
        var diseño= Diseño.from(
                command.getDiseñoId(),repository().getEventsBy(command.getDiseñoId().value())
        );
        diseño.actualizarInformacionDeUnProyectoSolar(command.getEntityId(),command.getInformacion());

        emit().onResponse(new ResponseEvents(diseño.getUncommittedChanges()));
    }
}
