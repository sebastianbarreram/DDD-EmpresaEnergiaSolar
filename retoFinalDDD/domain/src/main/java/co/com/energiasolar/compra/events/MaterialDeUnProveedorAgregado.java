package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.Descripcion;
import co.com.energiasolar.compra.values.MaterialId;
import co.com.energiasolar.compra.values.Precio;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class MaterialDeUnProveedorAgregado extends DomainEvent {
    public MaterialDeUnProveedorAgregado(ProveedorId proveedorId, MaterialId entityId, Precio precio, Descripcion descripcion) {
        super("energiasolar.compra.materialdeunproveedoragregado");
    }
}
