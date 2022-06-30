package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.DiseñoPreliminarId;
import co.com.energiasolar.cotizacion.values.Informacion;
import co.com.energiasolar.cotizacion.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class DiseñoPreliminarAgregado extends DomainEvent {
    public DiseñoPreliminarAgregado(DiseñoPreliminarId entityId, Precio precio, Informacion informacion) {
        super("energiasolar.cotizacion.diseñopreiminaragregado");
    }
}
