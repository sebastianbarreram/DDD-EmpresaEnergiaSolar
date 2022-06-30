package co.com.energiasolar.diseño.events;

import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.sofka.domain.generic.DomainEvent;

public class CotizacionAsociada extends DomainEvent {
    public CotizacionAsociada(CotizacionId cotizacionId) {
        super("energiasoalr.diseño.cotizacionasociada");
    }
}
