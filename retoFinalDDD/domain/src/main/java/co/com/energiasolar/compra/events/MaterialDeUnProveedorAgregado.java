package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.Descripcion;
import co.com.energiasolar.compra.values.MaterialId;
import co.com.energiasolar.compra.values.Precio;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class MaterialDeUnProveedorAgregado extends DomainEvent {

    private final ProveedorId proveedorId;
    private final MaterialId entityId;
    private final Precio precio;
    private final Descripcion descripcion;

    public MaterialDeUnProveedorAgregado(ProveedorId proveedorId, MaterialId entityId, Precio precio, Descripcion descripcion) {
        super("energiasolar.compra.materialdeunproveedoragregado");
        this.proveedorId = proveedorId;
        this.entityId = entityId;
        this.precio=precio;
        this.descripcion = descripcion;
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

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
