package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.Nombre;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeUnPorveedorActualizado extends DomainEvent {
    private final ProveedorId entityId;
    private final Nombre nombre;

    public NombreDeUnPorveedorActualizado(ProveedorId entityId, Nombre nombre) {
        super("energiasolar.compra.nombredeunproveedoractualizado");
        this.entityId = entityId;
        this.nombre = nombre;

    }

    public ProveedorId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
