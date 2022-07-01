package co.com.energiasolar.cotizacion.commands;

import co.com.energiasolar.cotizacion.values.DiseñoPreliminarId;
import co.com.energiasolar.cotizacion.values.Informacion;
import co.com.sofka.domain.generic.Command;

public class ActualizarInformacionDeUnDiseñoPreliminar extends Command {
    private final DiseñoPreliminarId entityId;
    private final Informacion informacion;

    public ActualizarInformacionDeUnDiseñoPreliminar(DiseñoPreliminarId entityId, Informacion informacion){
        this.entityId = entityId;
        this.informacion = informacion;
    }

    public DiseñoPreliminarId getEntityId() {
        return entityId;
    }

    public Informacion getInformacion() {
        return informacion;
    }
}
