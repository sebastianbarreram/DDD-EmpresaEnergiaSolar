package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.AnalistaComercialId;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeUnaAnalistaComercialActualizado extends DomainEvent {
    public NombreDeUnaAnalistaComercialActualizado(AnalistaComercialId entityId, Nombre nombre) {
        super("energiasolar.cotizacion.nombredeunanalistacomercialactualizado");
    }
}
