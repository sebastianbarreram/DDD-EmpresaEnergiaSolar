package co.com.energiasolar.compra;

import co.com.energiasolar.compra.values.AnalistaComprasId;
import co.com.energiasolar.compra.values.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class AnalistaCompras extends Entity<AnalistaComprasId> {
    private Nombre nombre;

    public AnalistaCompras(AnalistaComprasId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public void cambiarNombre(Nombre nombre){
        this.nombre= Objects.requireNonNull(nombre);
    }
}
