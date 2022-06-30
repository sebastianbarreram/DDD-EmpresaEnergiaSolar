package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.DiseñoPreliminarId;
import co.com.energiasolar.cotizacion.values.Informacion;
import co.com.energiasolar.cotizacion.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class DiseñoPreliminarAgregado extends DomainEvent {
    private final DiseñoPreliminarId entityId;
    private final Precio precio;
    private final Informacion informacion;

    public DiseñoPreliminarAgregado(DiseñoPreliminarId entityId, Precio precio, Informacion informacion) {
        super("energiasolar.cotizacion.diseñopreiminaragregado");
        this.entityId = entityId;
        this.precio = precio;
        this.informacion = informacion;
    }

    public DiseñoPreliminarId getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Informacion getInformacion() {
        return informacion;
    }
}
