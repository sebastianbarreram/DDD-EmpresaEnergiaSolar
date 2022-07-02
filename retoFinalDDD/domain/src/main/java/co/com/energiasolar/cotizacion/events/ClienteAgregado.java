package co.com.energiasolar.cotizacion.events;

import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.cotizacion.values.Direccion;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteAgregado extends DomainEvent {
    private final ClienteId entityId;
    private final CotizacionId cotizacionId;
    private final Nombre nombre;
    private final Direccion direccion;


    public ClienteAgregado(ClienteId entityId,Direccion direccion,Nombre nombre, CotizacionId cotizacionId) {
        super("energiasolar.cotizacion.clienteagregado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cotizacionId = cotizacionId;
    }

    public ClienteId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }
}
