package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.Direccion;
import co.com.sofka.domain.generic.DomainEvent;

public class DireccionDeUnClienteActualizada extends DomainEvent {
    private final ClienteId entityId;
    private final Direccion direccion;

    public DireccionDeUnClienteActualizada(ClienteId entityId, Direccion direccion) {
        super("energiasolar.cotizacion.direcciondeunclienteactualizado");
        this.entityId = entityId;
        this.direccion = direccion;
    }

    public ClienteId getEntityId() {
        return entityId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
