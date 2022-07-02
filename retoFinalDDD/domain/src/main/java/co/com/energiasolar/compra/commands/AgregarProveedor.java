package co.com.energiasolar.compra.commands;

import co.com.energiasolar.compra.values.AnalistaComprasId;
import co.com.energiasolar.compra.values.CompraId;
import co.com.energiasolar.compra.values.Nombre;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.Command;

public class AgregarProveedor extends Command {
    private final ProveedorId entityId;
    private final Nombre nombre;
    private final CompraId compraId;

    public AgregarProveedor(ProveedorId entityId, Nombre nombre, CompraId compraId){
        this.entityId=entityId;
        this.compraId=compraId;
        this.nombre=nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public ProveedorId getEntityId() {
        return entityId;
    }

    public CompraId getCompraId() {
        return compraId;
    }
}
