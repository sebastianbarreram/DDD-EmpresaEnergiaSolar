package co.com.energiasolar.cotizacion;

import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.cotizacion.values.Direccion;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cliente extends Entity<ClienteId> {
    private Direccion direccion;
    private Nombre nombre;

    public Cliente(ClienteId entityId, Direccion direccion, Nombre nombre, CotizacionId cotizacionId) {
        super(entityId);
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public void cambiarDireccion(Direccion direccion){
        this.direccion= Objects.requireNonNull(direccion);
    }

    public void cambiarNombre(Nombre nombre){
        this.nombre= Objects.requireNonNull(nombre);
    }

    public Direccion direccion() {
        return direccion;
    }

    public Nombre nombre() {
        return nombre;
    }
}
