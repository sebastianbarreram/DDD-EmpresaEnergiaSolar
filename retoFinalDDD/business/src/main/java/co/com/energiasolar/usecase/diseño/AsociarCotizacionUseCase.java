package co.com.energiasolar.usecase.diseño;

import co.com.energiasolar.diseño.Diseño;
import co.com.energiasolar.diseño.commands.AsociarCotizacion;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AsociarCotizacionUseCase extends UseCase<RequestCommand<AsociarCotizacion>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AsociarCotizacion> asociarCotizacionRequestCommand) {
        var command = asociarCotizacionRequestCommand.getCommand();
        var diseño=Diseño.from(
                command.getDiseñoId(),repository().getEventsBy(command.getDiseñoId().value())
        );
        diseño.asociarCotizacion(command.getCotizacionId(),command.getDiseñoId());

        emit().onResponse(new ResponseEvents(diseño.getUncommittedChanges()));

    }
}
