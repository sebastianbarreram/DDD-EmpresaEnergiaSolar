package co.com.energiasolar.cotizacion;

import co.com.energiasolar.cotizacion.values.AnalistaComercialId;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class AnalistaComercial extends Entity<AnalistaComercialId> {
    private Nombre nombre;

    public AnalistaComercial(AnalistaComercialId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public void cambiarNombre(Nombre nombre){
        Objects.requireNonNull(nombre);
        this.nombre=nombre;
    }

    public Nombre nombre() {
        return nombre;
    }
}
