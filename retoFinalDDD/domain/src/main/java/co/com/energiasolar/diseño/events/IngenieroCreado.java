package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.IngenieroId;
import co.com.energiasolar.diseño.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class IngenieroCreado extends DomainEvent {
    private final IngenieroId entityId;
    private final Nombre nombre;

    public IngenieroCreado(IngenieroId entityId, Nombre nombre) {
        super("energiasolar.diseño.ingenierocreado");
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
