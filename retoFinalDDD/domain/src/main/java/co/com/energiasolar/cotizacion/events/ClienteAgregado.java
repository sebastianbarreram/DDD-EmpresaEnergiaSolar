package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.Direccion;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteAgregado extends DomainEvent {
    private final ClienteId entityId;
    private final Direccion direccion;
    private final Nombre nombre;

    public ClienteAgregado(ClienteId entityId, Direccion direccion, Nombre nombre) {
        super("energiasolar.cotizacion.clienteagregado");
        this.entityId = entityId;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public ClienteId getEntityId() {
        return entityId;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
