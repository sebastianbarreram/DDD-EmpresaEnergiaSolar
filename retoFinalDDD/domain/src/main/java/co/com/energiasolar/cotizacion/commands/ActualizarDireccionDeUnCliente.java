package co.com.energiasolar.cotizacion.commands;

import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.Direccion;
import co.com.sofka.domain.generic.Command;

public class ActualizarDireccionDeUnCliente extends Command {
    private final ClienteId entityId;
    private final Direccion direccion;

    public ActualizarDireccionDeUnCliente(ClienteId entityId, Direccion direccion){
        this.entityId = entityId;
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public ClienteId getEntityId() {
        return entityId;
    }
}
