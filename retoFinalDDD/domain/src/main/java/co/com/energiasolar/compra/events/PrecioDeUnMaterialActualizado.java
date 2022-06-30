package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.MaterialId;
import co.com.energiasolar.compra.values.Precio;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioDeUnMaterialActualizado extends DomainEvent {

    private final ProveedorId proveedorId;
    private final MaterialId entityId;
    private final Precio precio;

    public PrecioDeUnMaterialActualizado(ProveedorId proveedorId, MaterialId entityId, Precio precio) {
        super("energiasolar.compra.preciodeunmaterialactualizado");
        this.proveedorId = proveedorId;
        this.entityId = entityId;
        this.precio = precio;
    }

    public ProveedorId getProveedorId() {
        return proveedorId;
    }

    public MaterialId getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
