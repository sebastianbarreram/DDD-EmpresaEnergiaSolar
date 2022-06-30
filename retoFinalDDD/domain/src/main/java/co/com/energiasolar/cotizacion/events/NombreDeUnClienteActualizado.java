package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeUnClienteActualizado extends DomainEvent {
    public NombreDeUnClienteActualizado(ClienteId entityId, Nombre nombre) {
        super("energiasolar.cotizacion.nombredeunclienteactualizado");
    }
}
