package co.com.energiasolar.diseño.events;

import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.sofka.domain.generic.DomainEvent;

public class CotizacionAsociada extends DomainEvent {
    private final CotizacionId cotizacionId;
    private final DiseñoId diseñoId;


    public CotizacionAsociada(CotizacionId cotizacionId, DiseñoId diseñoId) {
        super("energiasolar.diseño.cotizacionasociada");
        this.cotizacionId=cotizacionId;
        this.diseñoId=diseñoId;

    }

    public CotizacionId getCotizacionId() {
        return cotizacionId;
    }

    public DiseñoId getDiseñoId() {
        return diseñoId;
    }
}
