package co.com.energiasolar.diseño.events;

import co.com.energiasolar.diseño.values.AnalisisDeSombraId;
import co.com.energiasolar.diseño.values.Informacion;
import co.com.sofka.domain.generic.DomainEvent;

public class InformacionDeUnAnalisisDeSombraActualizada extends DomainEvent {
    public InformacionDeUnAnalisisDeSombraActualizada(AnalisisDeSombraId entityId, Informacion informacion) {
        super("energiasolar.diseño.informaciondeunanalisisdesombraactualizada");
    }
}
