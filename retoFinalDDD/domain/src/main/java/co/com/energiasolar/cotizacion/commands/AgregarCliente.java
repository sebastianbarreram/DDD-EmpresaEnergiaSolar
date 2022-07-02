package co.com.energiasolar.cotizacion.commands;

import co.com.energiasolar.cotizacion.values.*;
import co.com.sofka.domain.generic.Command;

public class AgregarCliente extends Command {
    private final ClienteId entityId;

    private final CotizacionId cotizacionId;
    private final Nombre nombre;
    private final Direccion direccion;

    public AgregarCliente(ClienteId entityId,Direccion direccion,Nombre nombre, CotizacionId cotizacionId) {
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
