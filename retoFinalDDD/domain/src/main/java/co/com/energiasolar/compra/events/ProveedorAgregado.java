package co.com.energiasolar.compra.events;

import co.com.energiasolar.compra.values.Nombre;
import co.com.energiasolar.compra.values.ProveedorId;
import co.com.sofka.domain.generic.DomainEvent;

public class ProveedorAgregado extends DomainEvent {
    public ProveedorAgregado(ProveedorId entityId, Nombre nombre) {
        super("energiasolar.compra.proveedorcreado");
    }
}
