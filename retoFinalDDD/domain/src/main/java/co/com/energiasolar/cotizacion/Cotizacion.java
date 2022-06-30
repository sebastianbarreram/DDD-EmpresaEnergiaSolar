package co.com.energiasolar.cotizacion;

import co.com.energiasolar.cotizacion.events.AnalistaComercialAgregado;
import co.com.energiasolar.cotizacion.events.ClienteAgregado;
import co.com.energiasolar.cotizacion.events.CotizacionCreada;
import co.com.energiasolar.cotizacion.events.DiseñoPreliminarAgregado;
import co.com.energiasolar.cotizacion.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;

public class Cotizacion extends AggregateEvent<CotizacionId> {
    protected AnalistaComercialId analistaComercialId;
    protected DiseñoPreliminarId diseñoPreliminarId;
    protected ClienteId clienteId;

    public Cotizacion(CotizacionId entityId, AnalistaComercialId analistaComercialId, DiseñoPreliminarId diseñoPreliminarId, ClienteId clienteId) {
        super(entityId);
        this.analistaComercialId = analistaComercialId;
        this.diseñoPreliminarId = diseñoPreliminarId;
        this.clienteId = clienteId;
        appendChange(new CotizacionCreada()).apply();
    }

    public void agregarCliente(ClienteId entityId, Direccion direccion, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(nombre);
        appendChange(new ClienteAgregado(entityId,direccion,nombre)).apply();
    }

    public void agregarDiseñoPreliminar(DiseñoPreliminarId entityId, Precio precio, Informacion informacion) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(informacion);
        appendChange(new DiseñoPreliminarAgregado(entityId,precio,informacion)).apply();
    }

    public void agregarAnalistaComercial(AnalistaComercialId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new AnalistaComercialAgregado(entityId, nombre)).apply();
    }

    public AnalistaComercialId analistaComercialId() {
        return analistaComercialId;
    }

    public DiseñoPreliminarId diseñoPreliminarId() {
        return diseñoPreliminarId;
    }

    public ClienteId clienteId() {
        return clienteId;
    }
}
