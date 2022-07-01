package co.com.energiasolar.compra.commands;

import co.com.energiasolar.compra.values.*;
import co.com.sofka.domain.generic.Command;

public class AgregarAnalistaCompras extends Command {
    private final Nombre nombre;
    private final AnalistaComprasId entityId;

    public AgregarAnalistaCompras(AnalistaComprasId entityId, Nombre nombre){
        this.entityId=entityId;
        this.nombre=nombre;
    }

    public AnalistaComprasId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
