package co.com.energiasolar.compra.commands;

import co.com.energiasolar.compra.values.AnalistaComprasId;
import co.com.energiasolar.compra.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreDeUnAnalistaCompras extends Command {

    private final AnalistaComprasId entityId;
    private final Nombre nombre;

    public ActualizarNombreDeUnAnalistaCompras(AnalistaComprasId entityId, Nombre nombre){
        this.entityId=entityId;
        this.nombre=nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public AnalistaComprasId getEntityId() {
        return entityId;
    }
}
