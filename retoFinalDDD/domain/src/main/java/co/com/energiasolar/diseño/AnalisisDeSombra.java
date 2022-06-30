package co.com.energiasolar.diseño;

import co.com.energiasolar.diseño.values.AnalisisDeSombraId;
import co.com.energiasolar.diseño.values.Informacion;
import co.com.sofka.domain.generic.Entity;

import javax.sound.sampled.Line;
import java.util.Objects;

public class AnalisisDeSombra extends Entity<AnalisisDeSombraId> {
    private Informacion informacion;

    public AnalisisDeSombra(AnalisisDeSombraId entityId, Informacion informacion) {
        super(entityId);
        this.informacion = informacion;
    }

    public void cambiarInformacion(Informacion informacion){
        this.informacion= Objects.requireNonNull(informacion);

    }
}
