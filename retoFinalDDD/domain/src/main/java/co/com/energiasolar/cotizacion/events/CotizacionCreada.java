package co.com.energiasolar.cotizacion.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CotizacionCreada extends DomainEvent {
    public CotizacionCreada() {
        super("energiasolar.cotizacion.cotizacioncreada");
    }
}
