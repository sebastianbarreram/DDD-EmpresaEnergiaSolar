package co.com.energiasolar.compra;

import co.com.energiasolar.compra.values.Descripcion;
import co.com.energiasolar.compra.values.MaterialId;
import co.com.energiasolar.compra.values.Precio;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Material extends Entity<MaterialId> {
    private Precio precio;
    private Descripcion descripcion;

    public Material(MaterialId entityId, Precio precio, Descripcion descripcion) {
        super(entityId);
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public void cambiarPrecio(Precio precio){
        this.precio= Objects.requireNonNull(precio);
    }

    public void cambiarDescripcion(Descripcion descripcion){
        this.descripcion= Objects.requireNonNull(descripcion);
    }

    public Precio precio() {
        return precio;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public void actualizarPrecio(Precio precio) {
        this.precio = precio;
    }

    public void actualizarDescripcion(Descripcion descripcion) {
        this.descripcion = descripcion;
    }
}
