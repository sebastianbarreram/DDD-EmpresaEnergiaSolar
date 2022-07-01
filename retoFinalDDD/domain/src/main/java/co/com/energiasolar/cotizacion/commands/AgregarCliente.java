package co.com.energiasolar.cotizacion.commands;

import co.com.energiasolar.cotizacion.values.AnalistaComercialId;
import co.com.energiasolar.cotizacion.values.ClienteId;
import co.com.energiasolar.cotizacion.values.Direccion;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class AgregarCliente extends Command {
    private final ClienteId entityId;
    private final Direccion direccion;
    private final Nombre nombre;

    public AgregarCliente(ClienteId entityId, Direccion direccion, Nombre nombre) {
        this.entityId = entityId;
        this.direccion = direccion;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public ClienteId getEntityId() {
        return entityId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
