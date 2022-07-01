package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.diseño.values.Informacion;
import co.com.energiasolar.diseño.values.IngenieroId;
import co.com.energiasolar.diseño.values.Nombre;
import co.com.energiasolar.diseño.values.ProyectoSolarId;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreDeUnIngeniero extends Command {
    private final Nombre nombre;
    private final IngenieroId entityId;

    public ActualizarNombreDeUnIngeniero(IngenieroId entityId, Nombre nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public IngenieroId getEntityId() {
        return entityId;
    }
}
