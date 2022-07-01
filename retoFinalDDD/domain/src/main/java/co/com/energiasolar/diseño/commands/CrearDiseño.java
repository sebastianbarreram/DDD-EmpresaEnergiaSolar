package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.diseño.values.Sede;
import co.com.sofka.domain.generic.Command;

public class CrearDiseño extends Command {

    private final Sede sede;
    private final DiseñoId entityId;

    public CrearDiseño(DiseñoId entityId, Sede sede) {
        this.entityId = entityId;
        this.sede = sede;
    }

    public Sede getSede() {
        return sede;
    }

    public DiseñoId getEntityId() {
        return entityId;
    }
}
