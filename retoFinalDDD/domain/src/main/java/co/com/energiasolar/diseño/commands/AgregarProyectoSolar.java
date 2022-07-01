package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.diseño.values.Informacion;
import co.com.energiasolar.diseño.values.IngenieroId;
import co.com.energiasolar.diseño.values.Nombre;
import co.com.energiasolar.diseño.values.ProyectoSolarId;
import co.com.sofka.domain.generic.Command;

public class AgregarProyectoSolar extends Command {
    private final ProyectoSolarId entityId;
    private final Informacion informacion;

    public AgregarProyectoSolar(ProyectoSolarId entityId, Informacion informacion) {
        this.entityId = entityId;
        this.informacion = informacion;
    }

    public ProyectoSolarId getEntityId() {
        return entityId;
    }

    public Informacion getInformacion() {
        return informacion;
    }
}
