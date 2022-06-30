package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.CompraId;
import co.com.sofka.domain.generic.DomainEvent;

public class CompraCreada extends DomainEvent {

    public CompraCreada(CompraId entityId) {
        super("energiasolar.compra.compracreada");
    }
}
