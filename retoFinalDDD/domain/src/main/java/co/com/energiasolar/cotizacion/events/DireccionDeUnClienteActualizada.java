package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.Direccion;
import co.com.sofka.domain.generic.DomainEvent;

public class DireccionDeUnClienteActualizada extends DomainEvent {
    public DireccionDeUnClienteActualizada(ClienteId entityId, Direccion direccion) {
        super("energiasolar.cotizacion.direcciondeunclienteactualizado");
    }
}
