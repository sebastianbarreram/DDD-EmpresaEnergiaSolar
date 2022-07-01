package co.com.energiasolar.cotizacion.commands;

import co.com.energiasolar.cotizacion.values.AnalistaComercialId;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.sofka.domain.generic.Command;

public class ActualizarNombreDeUnAnalistaComercial extends Command {
    private final AnalistaComercialId entityId;
    private final Nombre nombre;

    public ActualizarNombreDeUnAnalistaComercial(AnalistaComercialId entityId, Nombre nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public AnalistaComercialId getEntityId() {
        return entityId;
    }
}
