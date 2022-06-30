package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.Nombre;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeUnPorveedorActualizado extends DomainEvent {
    public NombreDeUnPorveedorActualizado(ProveedorId entityId, Nombre nombre) {
        super("energiasolar.compra.nombredeunproveedoractualizado");
    }
}
