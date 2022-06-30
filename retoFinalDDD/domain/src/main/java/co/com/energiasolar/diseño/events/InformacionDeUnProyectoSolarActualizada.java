package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.Informacion;
import co.com.energiasolar.diseño.values.ProyectoSolarId;
import co.com.sofka.domain.generic.DomainEvent;

public class InformacionDeUnProyectoSolarActualizada extends DomainEvent {
    private final ProyectoSolarId entityId;
    private final Informacion informacion;

    public InformacionDeUnProyectoSolarActualizada(ProyectoSolarId entityId, Informacion informacion) {
        super("energiasolar.diseño.informaciondeunproyectosolaractualizada");
        this.entityId = entityId;
        this.informacion = informacion;
    }

    public Informacion getInformacion() {
        return informacion;
    }

    public ProyectoSolarId getEntityId() {
        return entityId;
    }
}
