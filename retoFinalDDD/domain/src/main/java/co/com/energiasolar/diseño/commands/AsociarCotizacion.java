package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.diseño.values.Informacion;
import co.com.energiasolar.diseño.values.ProyectoSolarId;
import co.com.sofka.domain.generic.Command;

public class AsociarCotizacion extends Command {
    private final CotizacionId cotizacionId;

    public AsociarCotizacion(CotizacionId cotizacionId) {
        this.cotizacionId = cotizacionId;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }
}
