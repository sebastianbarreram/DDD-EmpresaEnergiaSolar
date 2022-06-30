package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.Direccion;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteAgregado extends DomainEvent {
    public ClienteAgregado(ClienteId entityId, Direccion direccion, Nombre nombre) {
        super("energiasolar.cotizacion.clienteagregado");
    }
}
