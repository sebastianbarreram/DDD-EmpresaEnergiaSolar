package co.com.energiasolar.cotizacion.commands;

import co.com.energiasolar.cotizacion.values.AnalistaComercialId;
import co.com.energiasolar.cotizacion.values.DiseñoPreliminarId;
import co.com.energiasolar.cotizacion.values.Nombre;
import co.com.energiasolar.cotizacion.values.Precio;
import co.com.sofka.domain.generic.Command;

public class AgregarAnalistaComercial extends Command {
    private final Nombre nombre;
    private final AnalistaComercialId entityId;

    public AgregarAnalistaComercial(AnalistaComercialId entityId, Nombre nombre) {
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public AnalistaComercialId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
