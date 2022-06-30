package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.AnalistaComprasId;
import co.com.energiasolar.compra.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class AnalistaDeComprasAgregado extends DomainEvent {
    public AnalistaDeComprasAgregado(AnalistaComprasId entityId, Nombre nombre) {
        super("energiasolar.compra.analistadecomprasagregado");
    }
}
