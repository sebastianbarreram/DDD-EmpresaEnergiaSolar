package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.diseño.values.AnalisisDeSombraId;
import co.com.energiasolar.diseño.values.Informacion;
import co.com.sofka.domain.generic.Command;

public class ActualizarInformacionDeUnAnalisisDeSombra extends Command {
    private final Informacion informacion;
    private final AnalisisDeSombraId entityId;

    public ActualizarInformacionDeUnAnalisisDeSombra(AnalisisDeSombraId entityId, Informacion informacion) {
        this.entityId = entityId;
        this.informacion = informacion;
    }

    public Informacion getInformacion() {
        return informacion;
    }

    public AnalisisDeSombraId getEntityId() {
        return entityId;
    }
}
