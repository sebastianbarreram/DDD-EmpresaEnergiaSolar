package co.com.energiasolar.diseño.events;

import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.diseño.values.Sede;
import co.com.sofka.domain.generic.DomainEvent;

public class DiseñoCreado extends DomainEvent {
    public DiseñoCreado(DiseñoId entityId, CotizacionId cotizacionId, Sede sede) {
        super("energiasolar.diseño.diseñocreado");
    }
}
