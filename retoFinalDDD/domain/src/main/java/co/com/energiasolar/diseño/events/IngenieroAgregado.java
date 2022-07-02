package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.diseño.values.IngenieroId;
import co.com.energiasolar.diseño.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class IngenieroAgregado extends DomainEvent {
    private final IngenieroId entityId;
    private final Nombre nombre;
    private final DiseñoId diseñoId;

    public IngenieroAgregado(IngenieroId entityId, Nombre nombre, DiseñoId diseñoId) {
        super("energiasolar.diseño.ingenierocreado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.diseñoId=diseñoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public IngenieroId getEntityId() {
        return entityId;
    }

    public DiseñoId getDiseñoId() {
        return diseñoId;
    }
}
