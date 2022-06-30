package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.AnalistaComercialId;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeUnaAnalistaComercialActualizado extends DomainEvent {
    private final Nombre nombre;
    private final AnalistaComercialId entityId;

    public NombreDeUnaAnalistaComercialActualizado(AnalistaComercialId entityId, Nombre nombre) {
        super("energiasolar.cotizacion.nombredeunanalistacomercialactualizado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public AnalistaComercialId getEntityId() {
        return entityId;
    }
}
