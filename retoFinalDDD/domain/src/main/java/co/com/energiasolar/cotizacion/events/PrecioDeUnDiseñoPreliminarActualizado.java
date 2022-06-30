package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.DiseñoPreliminarId;
import co.com.energiasolar.cotizacion.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioDeUnDiseñoPreliminarActualizado extends DomainEvent {
    private final DiseñoPreliminarId entityId;
    private final Precio precio;

    public PrecioDeUnDiseñoPreliminarActualizado(DiseñoPreliminarId entityId, Precio precio) {
        super("energiasolar.cotizacion.preciodeundiseñopreliminaractualizado");
        this.entityId = entityId;
        this.precio = precio;
    }

    public DiseñoPreliminarId getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
