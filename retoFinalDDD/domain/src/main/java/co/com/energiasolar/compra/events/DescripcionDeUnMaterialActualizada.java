package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.Descripcion;
import co.com.energiasolar.compra.values.MaterialId;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionDeUnMaterialActualizada extends DomainEvent {
    public DescripcionDeUnMaterialActualizada(ProveedorId proveedorId, MaterialId entityId, Descripcion descripcion) {
        super("energiasolar.compra.descripciondeunmaterialactualizada");
    }
}
