package co.com.energiasolar.compra.commands;

import co.com.energiasolar.compra.values.MaterialId;
import co.com.energiasolar.compra.values.Precio;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.Command;

public class ActualizarPrecioDeUnMaterial extends Command {
    private final MaterialId entityId;
    private final Precio precio;
    private final ProveedorId proveedorId;


    public ActualizarPrecioDeUnMaterial(ProveedorId proveedorId, MaterialId entityId, Precio precio){
        this.proveedorId=proveedorId;
        this.entityId=entityId;
        this.precio=precio;
    }

    public Precio getPrecio() {
        return precio;
    }

    public MaterialId getEntityId() {
        return entityId;
    }

    public ProveedorId getProveedorId() {
        return proveedorId;
    }
}
