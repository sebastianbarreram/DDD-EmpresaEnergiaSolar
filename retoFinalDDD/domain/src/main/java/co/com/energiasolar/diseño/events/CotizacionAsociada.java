package co.com.energiasolar.diseño.events;

import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.sofka.domain.generic.DomainEvent;

public class CotizacionAsociada extends DomainEvent {
    private final CotizacionId cotizacionId;

    public CotizacionAsociada(CotizacionId cotizacionId) {
        super("energiasoalr.diseño.cotizacionasociada");
        this.cotizacionId=cotizacionId;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }
}
