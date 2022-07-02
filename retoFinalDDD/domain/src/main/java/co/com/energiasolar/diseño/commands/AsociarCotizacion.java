package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.diseño.values.Informacion;
import co.com.energiasolar.diseño.values.ProyectoSolarId;
import co.com.sofka.domain.generic.Command;

public class AsociarCotizacion extends Command {
    private final CotizacionId cotizacionId;
    private final DiseñoId diseñoId;


    public AsociarCotizacion(CotizacionId cotizacionId, DiseñoId diseñoId) {
        this.cotizacionId = cotizacionId;
        this.diseñoId = diseñoId;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }

    public DiseñoId getDiseñoId() {
        return diseñoId;
    }
}
