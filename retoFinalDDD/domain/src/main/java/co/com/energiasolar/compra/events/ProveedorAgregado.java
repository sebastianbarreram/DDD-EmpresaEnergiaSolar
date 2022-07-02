package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.CompraId;
import co.com.energiasolar.compra.values.Nombre;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProveedorAgregado extends DomainEvent {
    private final ProveedorId entityId;
    private final Nombre nombre;
    private final CompraId compraId;

    public ProveedorAgregado(ProveedorId entityId, Nombre nombre, CompraId compraId) {
        super("energiasolar.compra.proveedorcreado");
        this.entityId = entityId;
        this.compraId = compraId;
        this.nombre = nombre;
    }

    public ProveedorId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public CompraId getCompraId() {
        return compraId;
    }
}
