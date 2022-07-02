package co.com.energiasolar.usecase.diseño;

import co.com.energiasolar.diseño.Diseño;
import co.com.energiasolar.diseño.commands.ActualizarNombreDeUnIngeniero;
import co.com.energiasolar.diseño.commands.CambiarSede;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CambiarSedeUseCase extends UseCase<RequestCommand<CambiarSede>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarSede> CambiarSedeDeUnDiseñoRequestCommand) {
        var command = CambiarSedeDeUnDiseñoRequestCommand.getCommand();
        var diseño= Diseño.from(
                command.getDiseñoId(),repository().getEventsBy(command.getDiseñoId().value())
        );
        diseño.cambiarSede(command.getSede());

        emit().onResponse(new ResponseEvents(diseño.getUncommittedChanges()));
    }
}
