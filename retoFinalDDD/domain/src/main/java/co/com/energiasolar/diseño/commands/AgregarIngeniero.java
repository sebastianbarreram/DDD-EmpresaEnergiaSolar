package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.diseño.values.*;
import co.com.sofka.domain.generic.Command;

public class AgregarIngeniero extends Command {
    private final Nombre nombre;
    private final IngenieroId entityId;
    private final DiseñoId diseñoId;

    public AgregarIngeniero(IngenieroId entityId, Nombre nombre, DiseñoId diseñoId) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.diseñoId = diseñoId;
    }

    public IngenieroId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public DiseñoId getDiseñoId() {
        return diseñoId;
    }
}

