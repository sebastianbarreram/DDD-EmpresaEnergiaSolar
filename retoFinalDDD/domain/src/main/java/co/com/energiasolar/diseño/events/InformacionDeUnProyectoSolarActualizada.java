package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.Informacion;
import co.com.energiasolar.diseño.values.ProyectoSolarId;
import co.com.sofka.domain.generic.DomainEvent;

public class InformacionDeUnProyectoSolarActualizada extends DomainEvent {
    public InformacionDeUnProyectoSolarActualizada(ProyectoSolarId entityId, Informacion informacion) {
        super("energiasolar.diseño.informaciondeunproyectosolaractualizada");
    }
}
