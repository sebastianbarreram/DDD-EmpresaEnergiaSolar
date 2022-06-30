package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.sofka.domain.generic.DomainEvent;

public class CotizacionCreada extends DomainEvent {
    private final CotizacionId entityId;
    public CotizacionCreada(CotizacionId entityId) {
        super("energiasolar.cotizacion.cotizacioncreada");
        this.entityId=entityId;
    }

    public CotizacionId getEntityId() {
        return entityId;
    }
}
