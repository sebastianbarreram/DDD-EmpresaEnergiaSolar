package co.com.energiasolar.cotizacion.commands;

import co.com.energiasolar.cotizacion.values.DiseñoPreliminarId;
import co.com.energiasolar.cotizacion.values.Precio;
import co.com.sofka.domain.generic.Command;

public class ActualizarPrecioDeUnDiseñoPreliminar extends Command {
    private final DiseñoPreliminarId entityId;
    private final Precio precio;

    public ActualizarPrecioDeUnDiseñoPreliminar(DiseñoPreliminarId entityId, Precio precio) {
        this.entityId = entityId;
        this.precio = precio;
    }

    public DiseñoPreliminarId getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
