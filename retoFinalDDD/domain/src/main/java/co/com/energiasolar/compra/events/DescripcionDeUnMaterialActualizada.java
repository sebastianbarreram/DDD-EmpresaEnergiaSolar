package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.Descripcion;
import co.com.energiasolar.compra.values.MaterialId;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionDeUnMaterialActualizada extends DomainEvent {
    private final ProveedorId proveedorId;
    private final MaterialId entityId;
    private final Descripcion descripcion;

    public DescripcionDeUnMaterialActualizada(ProveedorId proveedorId, MaterialId entityId, Descripcion descripcion) {
        super("energiasolar.compra.descripciondeunmaterialactualizada");
        this.proveedorId = proveedorId;
        this.entityId = entityId;
        this.descripcion = descripcion;
    }

    public ProveedorId getProveedorId() {
        return proveedorId;
    }

    public MaterialId getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
