package co.com.energiasolar.cotizacion.commands;


import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreDeUnCliente extends Command {
    private final ClienteId entityId;
    private final Nombre nombre;
    private final CotizacionId cotizacionId;


    public ActualizarNombreDeUnCliente(ClienteId entityId, Nombre nombre, CotizacionId cotizacionId) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.cotizacionId = cotizacionId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public ClienteId getEntityId() {
        return entityId;
    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }
}
