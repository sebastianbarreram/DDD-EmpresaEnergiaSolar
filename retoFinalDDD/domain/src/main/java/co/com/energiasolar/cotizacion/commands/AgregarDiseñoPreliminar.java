package co.com.energiasolar.cotizacion.commands;

import co.com.energiasolar.cotizacion.values.*;
import co.com.sofka.domain.generic.Command;

public class AgregarDiseñoPreliminar extends Command {
    private final DiseñoPreliminarId entityId;
    private final Informacion informacion;
    private final Precio precio;

    public AgregarDiseñoPreliminar(DiseñoPreliminarId entityId, Precio precio, Informacion informacion) {
        this.entityId = entityId;
        this.precio = precio;
        this.informacion = informacion;
    }

    public DiseñoPreliminarId getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Informacion getInformacion() {
        return informacion;
    }
}
