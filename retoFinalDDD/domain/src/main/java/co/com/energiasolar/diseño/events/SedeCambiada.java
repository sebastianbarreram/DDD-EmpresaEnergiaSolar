package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.Sede;
import co.com.sofka.domain.generic.DomainEvent;

public class SedeCambiada extends DomainEvent {
    public SedeCambiada(Sede sede) {
        super("energiasolar.diseño.sedecambiada");
    }
}
