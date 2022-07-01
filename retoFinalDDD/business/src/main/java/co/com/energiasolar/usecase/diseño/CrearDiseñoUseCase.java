package co.com.energiasolar.usecase.diseño;

import co.com.energiasolar.diseño.Diseño;
import co.com.energiasolar.diseño.commands.CrearDiseño;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearDiseñoUseCase extends UseCase<RequestCommand<CrearDiseño>, ResponseEvents>{
    @Override
    public void executeUseCase(RequestCommand<CrearDiseño> crearDiseñoRequestCommand) {
        var command = crearDiseñoRequestCommand.getCommand();
        var diseño=new Diseño(
                command.getEntityId(),
                command.getSede()
        );
        emit().onResponse(new ResponseEvents(diseño.getUncommittedChanges()));
    }
}
