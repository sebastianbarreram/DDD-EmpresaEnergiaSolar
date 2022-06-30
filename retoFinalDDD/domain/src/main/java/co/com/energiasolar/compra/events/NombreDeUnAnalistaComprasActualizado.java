package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.AnalistaComprasId;
import co.com.energiasolar.compra.values.Nombre;

public class NombreDeUnAnalistaComprasActualizado extends co.com.sofka.domain.generic.DomainEvent {
    public NombreDeUnAnalistaComprasActualizado(AnalistaComprasId entityId, Nombre nombre) {
        super("energiasolar.compra.nombredeunanalistacomprasactualizado");
    }
}
