package co.com.energiasolar.usecase.cotizacion;

import co.com.energiasolar.cotizacion.Cotizacion;
import co.com.energiasolar.cotizacion.commands.CrearCotizacion;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearCotizacionUseCase extends UseCase<RequestCommand<CrearCotizacion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCotizacion> crearCotizacionRequestCommand) {
        var command = crearCotizacionRequestCommand.getCommand();
        var cotizacion=new Cotizacion(
                command.getEntityId());
        emit().onResponse(new ResponseEvents(cotizacion.getUncommittedChanges()));
    }
}
