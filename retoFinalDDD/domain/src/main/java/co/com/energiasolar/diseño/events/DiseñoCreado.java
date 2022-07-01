package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.sofka.domain.generic.DomainEvent;

public class DiseñoCreado extends DomainEvent {
    private final DiseñoId entityId;

    public DiseñoCreado(DiseñoId entityId) {
        super("energiasolar.diseño.diseñocreado");
        this.entityId = entityId;

    }

    public DiseñoId getEntityId() {
        return entityId;
    }

}
