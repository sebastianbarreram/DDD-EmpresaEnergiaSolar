package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.diseño.values.Informacion;
import co.com.energiasolar.diseño.values.ProyectoSolarId;
import co.com.sofka.domain.generic.Command;

public class ActualizarInformacionDeUnProyectoSolar extends Command {
    private final ProyectoSolarId entityId;
    private final Informacion informacion;

    public ActualizarInformacionDeUnProyectoSolar(ProyectoSolarId entityId, Informacion informacion) {
        this.entityId = entityId;
        this.informacion = informacion;
    }

    public Informacion getInformacion() {
        return informacion;
    }

    public ProyectoSolarId getEntityId() {
        return entityId;
    }
}
