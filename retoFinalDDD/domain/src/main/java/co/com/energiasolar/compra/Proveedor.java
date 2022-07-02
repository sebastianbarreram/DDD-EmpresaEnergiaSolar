package co.com.energiasolar.compra;

import co.com.energiasolar.compra.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Proveedor extends Entity<ProveedorId> {
    private Nombre nombre;
    private Set<Material> materiales;

    public Proveedor(ProveedorId entityId, Nombre nombre, CompraId compraId) {
        super(entityId);
        this.nombre = nombre;
    }

    public void cambiarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void agregarMaterial(MaterialId entityId, Precio precio, Descripcion descripcion) {
        this.materiales.add(new Material(
                entityId,
                precio,
                descripcion
        ));
    }

    public void cambiarDescripcionDeUnMaterial(MaterialId entityId, Descripcion descripcion) {
        var material=getMaterialPorId(entityId)
                .orElseThrow(() -> new IllegalArgumentException("No se encuentra el material del proveedor"));
        material.actualizarDescripcion(descripcion);
    }

    public void cambiarPrecioDeUnMaterial(MaterialId entityId, Precio precio) {
        var material=getMaterialPorId(entityId)
                .orElseThrow(() -> new IllegalArgumentException("No se encuentra el material del proveedor"));
        material.actualizarPrecio(precio);
    }


    protected Optional<Material> getMaterialPorId(MaterialId materialId) {
        return materiales()
                .stream()
                .filter(material -> material.identity().equals(materialId))
                .findFirst();
    }

    public Set<Material> materiales() {
        return materiales;
    }
}
