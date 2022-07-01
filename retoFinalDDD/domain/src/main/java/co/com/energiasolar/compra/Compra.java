package co.com.energiasolar.compra;

import co.com.energiasolar.compra.events.*;
import co.com.energiasolar.compra.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Compra extends AggregateEvent<CompraId> {
    protected Set<Proveedor> proveedores;


    public Compra(CompraId entityId) {
        super(entityId);
        appendChange(new CompraCreada(entityId)).apply();
        subscribe(new CompraChange(this));
    }

    public void agregarProveedor(ProveedorId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new ProveedorAgregado(entityId, nombre)).apply();
    }

    public void agregarAnalistaCompras(AnalistaComprasId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new AnalistaDeComprasAgregado(entityId, nombre)).apply();
    }

    public void actualizarNombreDeUnProveedor(ProveedorId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreDeUnPorveedorActualizado(entityId, nombre)).apply();
    }

    public void actualizarPrecioDeUnMaterial(ProveedorId proveedorId, MaterialId entityId, Precio precio) {
        Objects.requireNonNull(proveedorId);
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(precio);
        appendChange(new PrecioDeUnMaterialActualizado(proveedorId, entityId, precio)).apply();
    }

    public void actualizarDescripcionDeUnMaterial(ProveedorId proveedorId, MaterialId entityId, Descripcion descripcion) {
        Objects.requireNonNull(proveedorId);
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionDeUnMaterialActualizada(proveedorId, entityId, descripcion)).apply();
    }

    public void actualizarNombreDeUnAnalistaCompras(AnalistaComprasId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreDeUnAnalistaComprasActualizado(entityId, nombre)).apply();
    }

    protected Optional<Proveedor> getProveedorPorId(ProveedorId proveedorId) {
        return proveedores()
                .stream()
                .filter(material -> material.identity().equals(proveedorId))
                .findFirst();
    }

    public Set<Proveedor> proveedores() {
        return proveedores;
    }
}
