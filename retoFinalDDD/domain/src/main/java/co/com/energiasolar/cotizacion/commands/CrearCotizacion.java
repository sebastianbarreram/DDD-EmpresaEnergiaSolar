package co.com.energiasolar.cotizacion.commands;

import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.sofka.domain.generic.Command;

public class CrearCotizacion extends Command {
    private final CotizacionId entityId;

    public CrearCotizacion(CotizacionId entityId) {
        this.entityId=entityId;
    }

    public CotizacionId getEntityId() {
        return entityId;
    }
}
