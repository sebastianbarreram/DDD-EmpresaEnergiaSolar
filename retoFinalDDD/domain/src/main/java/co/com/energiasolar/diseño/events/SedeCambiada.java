package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.Sede;
import co.com.sofka.domain.generic.DomainEvent;

public class SedeCambiada extends DomainEvent {
    private final Sede sede;

    public SedeCambiada(Sede sede) {
        super("energiasolar.diseño.sedecambiada");
        this.sede = sede;
    }

    public Sede getSede() {
        return sede;
    }
}
