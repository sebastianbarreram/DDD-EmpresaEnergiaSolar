package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.AnalistaComercialId;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class AnalistaComercialAgregado extends DomainEvent {
    public AnalistaComercialAgregado(AnalistaComercialId entityId, Nombre nombre) {
        super("energiasolar.cotizacion.analistacomercialagregado");
    }
}
