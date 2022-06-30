package co.com.energiasolar.cotizacion;

import co.com.energiasolar.cotizacion.values.DiseñoPreliminarId;
import co.com.energiasolar.cotizacion.values.Informacion;
import co.com.energiasolar.cotizacion.values.Precio;
import co.com.sofka.domain.generic.Entity;

import javax.sound.sampled.Line;
import java.util.Objects;

public class DiseñoPreliminar extends Entity<DiseñoPreliminarId> {
    protected Precio precio;
    protected Informacion informacion;

    public DiseñoPreliminar(DiseñoPreliminarId entityId, Precio precio, Informacion informacion) {
        super(entityId);
        this.informacion = informacion;
        this.precio = precio;
    }

    public void cambiarPrecio(Precio precio) {
        Objects.requireNonNull(precio);
        this.precio = precio;
    }

    public void cambiarInformación(Informacion informacion) {
        Objects.requireNonNull(informacion);
        this.informacion = informacion;
    }

    public Informacion informacion() {
        return informacion;
    }

    public Precio precio() {
        return precio;
    }
}
