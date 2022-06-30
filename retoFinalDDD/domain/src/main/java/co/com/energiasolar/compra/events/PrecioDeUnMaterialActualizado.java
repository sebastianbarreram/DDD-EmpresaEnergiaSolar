package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.MaterialId;
import co.com.energiasolar.compra.values.Precio;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioDeUnMaterialActualizado extends DomainEvent {
    public PrecioDeUnMaterialActualizado(ProveedorId proveedorId, MaterialId entityId, Precio precio) {
        super("energiasolar.compra.preciodeunmaterialactualizado");
    }
}
