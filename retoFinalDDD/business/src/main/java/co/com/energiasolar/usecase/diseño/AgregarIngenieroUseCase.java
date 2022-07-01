package co.com.energiasolar.usecase.diseño;

import co.com.energiasolar.diseño.Diseño;
import co.com.energiasolar.diseño.Ingeniero;
import co.com.energiasolar.diseño.commands.AgregarIngeniero;
import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AgregarIngenieroUseCase extends UseCase<RequestCommand<AgregarIngeniero>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarIngeniero> agregarIngenieroRequestCommand) {
//        var command = agregarIngenieroRequestCommand.getCommand();
//        var diseño=new Diseño(new DiseñoId(),);
//        var ingeniero= new Ingeniero(
//                command.getEntityId(),
//                command.getNombre()
//        );
//
//        emit().onResponse(new ResponseEvents(ingeniero.getUncommittedChanges()));
    }
}
