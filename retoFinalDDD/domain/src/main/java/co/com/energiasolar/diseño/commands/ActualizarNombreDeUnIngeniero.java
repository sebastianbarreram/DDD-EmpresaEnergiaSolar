package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.diseño.values.*;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreDeUnIngeniero extends Command {
    private final Nombre nombre;
    private final IngenieroId entityId;
    private final DiseñoId diseñoId;

    public ActualizarNombreDeUnIngeniero(IngenieroId entityId, Nombre nombre, DiseñoId diseñoId) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.diseñoId=diseñoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public IngenieroId getEntityId() {
        return entityId;
    }

    public DiseñoId getDiseñoId() {
        return diseñoId;
    }
}
