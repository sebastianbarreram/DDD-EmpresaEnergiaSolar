package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.IngenieroId;
import co.com.energiasolar.diseño.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class IngenieroCreado extends DomainEvent {
    public IngenieroCreado(IngenieroId entityId, Nombre nombre) {
        super("energiasolar.diseño.ingenierocreado");
    }
}
