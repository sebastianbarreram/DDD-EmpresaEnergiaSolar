package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.DiseñoPreliminarId;
import co.com.energiasolar.cotizacion.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioDeUnDiseñoPreliminarActualizado extends DomainEvent {
    public PrecioDeUnDiseñoPreliminarActualizado(DiseñoPreliminarId entityId, Precio precio) {
        super("energiasolar.cotizacion.preciodeundiseñopreliminaractualizado");
    }
}
