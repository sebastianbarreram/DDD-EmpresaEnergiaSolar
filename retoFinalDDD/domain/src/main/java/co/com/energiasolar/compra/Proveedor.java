package co.com.energiasolar.compra;

import co.com.energiasolar.compra.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Proveedor extends Entity<ProveedorId> {
    private Nombre nombre;
    private Set<Material> materiales;

    public Proveedor(ProveedorId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public void cambiarNombre(Nombre nombre){
        this.nombre= Objects.requireNonNull(nombre);
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
