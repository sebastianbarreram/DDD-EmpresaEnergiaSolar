package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.diseño.values.AnalisisDeSombraId;
import co.com.energiasolar.diseño.values.Informacion;
import co.com.energiasolar.diseño.values.IngenieroId;
import co.com.energiasolar.diseño.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class AgregarIngeniero extends Command {
    private final Nombre nombre;
    private final IngenieroId entityId;

    public AgregarIngeniero(IngenieroId entityId, Nombre nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IngenieroId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
