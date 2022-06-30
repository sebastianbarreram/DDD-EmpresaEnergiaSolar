package co.com.energiasolar.diseño.events;

import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.diseño.values.Sede;
import co.com.sofka.domain.generic.DomainEvent;

public class DiseñoCreado extends DomainEvent {
    private final DiseñoId entityId;
    private final CotizacionId cotizacionId;
    private final Sede sede;

    public DiseñoCreado(DiseñoId entityId, CotizacionId cotizacionId, Sede sede) {
        super("energiasolar.diseño.diseñocreado");
        this.entityId = entityId;
        this.cotizacionId = cotizacionId;
        this.sede = sede;
    }

    public DiseñoId getEntityId() {
        return entityId;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }

    public Sede getSede() {
        return sede;
    }
}
