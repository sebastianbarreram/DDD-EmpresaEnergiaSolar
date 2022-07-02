package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.diseño.values.Informacion;
import co.com.energiasolar.diseño.values.ProyectoSolarId;
import co.com.sofka.domain.generic.Command;

public class ActualizarInformacionDeUnProyectoSolar extends Command {
    private final ProyectoSolarId entityId;
    private final Informacion informacion;
    private final DiseñoId diseñoId;

    public ActualizarInformacionDeUnProyectoSolar(ProyectoSolarId entityId, Informacion informacion, DiseñoId diseñoId) {
        this.entityId = entityId;
        this.diseñoId = diseñoId;
        this.informacion = informacion;
    }

    public Informacion getInformacion() {
        return informacion;
    }

    public ProyectoSolarId getEntityId() {
        return entityId;
    }

    public DiseñoId getDiseñoId() {
        return diseñoId;
    }
}
