package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.AnalistaComprasId;
import co.com.energiasolar.compra.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class AnalistaDeComprasAgregado extends DomainEvent {
    private final AnalistaComprasId entityId;
    private final Nombre nombre;
    public AnalistaDeComprasAgregado(AnalistaComprasId entityId, Nombre nombre) {
        super("energiasolar.compra.analistadecomprasagregado");
        this.entityId=entityId;
        this.nombre=nombre;
    }

    public AnalistaComprasId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
