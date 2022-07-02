package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.diseño.values.Informacion;
import co.com.energiasolar.diseño.values.ProyectoSolarId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProyectoSolarAgregado extends DomainEvent {
    private final ProyectoSolarId entityId;
    private final Informacion informacion;

    public ProyectoSolarAgregado(ProyectoSolarId entityId, Informacion informacion, DiseñoId of) {
        super("energiasolar.diseño.proyectosolaragregado");
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
