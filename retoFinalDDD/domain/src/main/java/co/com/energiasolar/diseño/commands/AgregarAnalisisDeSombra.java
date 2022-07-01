package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.diseño.values.AnalisisDeSombraId;
import co.com.energiasolar.diseño.values.Informacion;
import co.com.energiasolar.diseño.values.IngenieroId;
import co.com.energiasolar.diseño.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class AgregarAnalisisDeSombra extends Command {
    private final Informacion informacion;
    private final AnalisisDeSombraId entityId;

    public AgregarAnalisisDeSombra(AnalisisDeSombraId entityId, Informacion informacion) {
        this.entityId = entityId;
        this.informacion = informacion;
    }

    public AnalisisDeSombraId getEntityId() {
        return entityId;
    }

    public Informacion getInformacion() {
        return informacion;
    }
}
