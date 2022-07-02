package co.com.energiasolar.diseño.events;

import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.diseño.values.Sede;
import co.com.sofka.domain.generic.DomainEvent;

public class DiseñoCreado extends DomainEvent {
    private final Sede sede;
    private final DiseñoId diseñoId;


    public DiseñoCreado(DiseñoId diseñoId,Sede sede) {
        super("energiasolar.diseño.diseñocreado");
        this.sede=sede;
        this.diseñoId=diseñoId;

    }

    public Sede getSede() {
        return sede;
    }

    public DiseñoId getDiseñoId() {
        return diseñoId;
    }
}
