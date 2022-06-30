package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.AnalistaComercialId;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class AnalistaComercialAgregado extends DomainEvent {
    private final AnalistaComercialId entityId;
    private final Nombre nombre;

    public AnalistaComercialAgregado(AnalistaComercialId entityId, Nombre nombre) {
        super("energiasolar.cotizacion.analistacomercialagregado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public AnalistaComercialId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
