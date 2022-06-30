package co.com.energiasolar.compra;

import co.com.energiasolar.compra.events.AnalistaDeComprasAgregado;
import co.com.energiasolar.compra.events.CompraCreada;
import co.com.energiasolar.compra.events.NombreDeUnPorveedorActualizado;
import co.com.energiasolar.compra.events.ProveedorAgregado;
import co.com.energiasolar.compra.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Set;

public class Compra extends AggregateEvent<CompraId> {
    protected Set<Proveedor> proveedores;

    public Compra(CompraId entityId) {
        super(entityId);
        appendChange(new CompraCreada(entityId)).apply();
    }
    public void ProveedorAgregado(ProveedorId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new ProveedorAgregado(entityId,nombre)).apply();
    }

    public void agregarAnalistaCompras(AnalistaComprasId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new AnalistaDeComprasAgregado(entityId,nombre)).apply();
    }

    public void actualizarNombreDeUnProveedor(ProveedorId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreDeUnPorveedorActualizado(entityId,nombre)).apply();
    }

    public Set<Proveedor> proveedores() {
        return proveedores;
    }
}
