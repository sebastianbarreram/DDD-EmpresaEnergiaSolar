package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeUnClienteActualizado extends DomainEvent {
    private final ClienteId entityId;
    private final Nombre nombre;

    public NombreDeUnClienteActualizado(ClienteId entityId, Nombre nombre) {
        super("energiasolar.cotizacion.nombredeunclienteactualizado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public ClienteId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
