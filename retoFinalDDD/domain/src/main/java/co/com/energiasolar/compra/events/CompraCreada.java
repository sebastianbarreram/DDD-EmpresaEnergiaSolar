package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.CompraId;
import co.com.sofka.domain.generic.DomainEvent;

public class CompraCreada extends DomainEvent {
    private final CompraId entityId;
    public CompraCreada(CompraId entityId) {
        super("energiasolar.compra.compracreada");
        this.entityId=entityId;
    }

    public CompraId getEntityId() {
        return entityId;
    }
}
