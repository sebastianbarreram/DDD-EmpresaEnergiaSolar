package co.com.energiasolar.cotizacion.commands;


import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreDeUnCliente extends Command {
    private final ClienteId entityId;
    private final Nombre nombre;

    public ActualizarNombreDeUnCliente(ClienteId entityId, Nombre nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public ClienteId getEntityId() {
        return entityId;
    }
}
