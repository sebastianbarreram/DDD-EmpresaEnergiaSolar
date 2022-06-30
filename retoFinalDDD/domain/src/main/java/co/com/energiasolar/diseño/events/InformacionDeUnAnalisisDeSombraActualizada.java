package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.AnalisisDeSombraId;
import co.com.energiasolar.diseño.values.Informacion;
import co.com.sofka.domain.generic.DomainEvent;

public class InformacionDeUnAnalisisDeSombraActualizada extends DomainEvent {
    private final AnalisisDeSombraId entityId;
    private final Informacion informacion;

    public InformacionDeUnAnalisisDeSombraActualizada(AnalisisDeSombraId entityId, Informacion informacion) {
        super("energiasolar.diseño.informaciondeunanalisisdesombraactualizada");
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
