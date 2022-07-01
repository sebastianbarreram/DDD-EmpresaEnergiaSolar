package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.AnalisisDeSombraId;
import co.com.energiasolar.diseño.values.Informacion;
import co.com.sofka.domain.generic.DomainEvent;

public class AnalisisDeSombraAgregado extends DomainEvent {
    private final AnalisisDeSombraId entityId;
    private final Informacion informacion;

    public AnalisisDeSombraAgregado(AnalisisDeSombraId entityId, Informacion informacion) {
        super("energiasolar.diseño.analisisdesombraagregado");
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
