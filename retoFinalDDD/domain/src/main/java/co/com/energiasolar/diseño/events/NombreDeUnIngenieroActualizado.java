package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.IngenieroId;
import co.com.energiasolar.diseño.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeUnIngenieroActualizado extends DomainEvent {
    private final IngenieroId entityId;
    private final Nombre nombre;

    public NombreDeUnIngenieroActualizado(IngenieroId entityId, Nombre nombre) {
        super("energiasolar.diseño.nombredeunaingenieroactualizado");
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
