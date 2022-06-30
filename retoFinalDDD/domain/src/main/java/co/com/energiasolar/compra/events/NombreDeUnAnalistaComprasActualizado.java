package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.AnalistaComprasId;
import co.com.energiasolar.compra.values.Nombre;

public class NombreDeUnAnalistaComprasActualizado extends co.com.sofka.domain.generic.DomainEvent {
    private final Nombre nombre;
    private final AnalistaComprasId entityId;

    public NombreDeUnAnalistaComprasActualizado(AnalistaComprasId entityId, Nombre nombre) {
        super("energiasolar.compra.nombredeunanalistacomprasactualizado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public AnalistaComprasId getEntityId() {
        return entityId;
    }
}
