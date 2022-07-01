package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.DiseñoPreliminarId;
import co.com.energiasolar.cotizacion.values.Informacion;
import co.com.energiasolar.cotizacion.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class InformacionDeUnDiseñoPreliminarActualizada extends DomainEvent {
    private final DiseñoPreliminarId entityId;
    private final Informacion informacion;

    public InformacionDeUnDiseñoPreliminarActualizada(DiseñoPreliminarId entityId, Informacion informacion) {
        super("energiasolar.cotizacion.preciodeundiseñopreliminaractualizado");
        this.entityId = entityId;
        this.informacion = informacion;
    }

    public Informacion getInformacion() {
        return informacion;
    }

    public DiseñoPreliminarId getEntityId() {
        return entityId;
    }
}
