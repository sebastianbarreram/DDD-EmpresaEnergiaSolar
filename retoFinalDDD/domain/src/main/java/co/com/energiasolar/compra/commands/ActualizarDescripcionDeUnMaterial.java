package co.com.energiasolar.compra.commands;

import co.com.energiasolar.compra.values.Descripcion;
import co.com.energiasolar.compra.values.MaterialId;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.Command;

public class ActualizarDescripcionDeUnMaterial extends Command {
    private final ProveedorId proveedorId;
    private final MaterialId entityId;
    private final Descripcion descripcion;

    public ActualizarDescripcionDeUnMaterial(ProveedorId proveedorId, MaterialId entityId, Descripcion descripcion) {
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
