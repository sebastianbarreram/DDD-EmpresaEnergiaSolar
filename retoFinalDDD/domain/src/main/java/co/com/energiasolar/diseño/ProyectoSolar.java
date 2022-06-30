package co.com.energiasolar.diseño;

import co.com.energiasolar.diseño.values.Informacion;
import co.com.energiasolar.diseño.values.ProyectoSolarId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class ProyectoSolar extends Entity<ProyectoSolarId> {
    private Informacion informacion;

    public ProyectoSolar(ProyectoSolarId entityId, Informacion informacion) {
        super(entityId);
        this.informacion = informacion;
    }

    public void cambiarInformacion(Informacion informacion){
        this.informacion= Objects.requireNonNull(informacion);

    }
}
