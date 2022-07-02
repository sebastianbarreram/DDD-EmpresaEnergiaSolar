package co.com.energiasolar.cotizacion;

import co.com.energiasolar.compra.Compra;
import co.com.energiasolar.compra.events.CompraCreada;
import co.com.energiasolar.compra.values.CompraId;
import co.com.energiasolar.cotizacion.events.*;
import co.com.energiasolar.cotizacion.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Cotizacion extends AggregateEvent<CotizacionId> {
    protected AnalistaComercialId analistaComercialId;
    protected DiseñoPreliminarId diseñoPreliminarId;
    protected ClienteId clienteId;

    public Cotizacion(CotizacionId entityId){
        super(entityId);
        appendChange(new CotizacionCreada(entityId)).apply();
        subscribe(new CotizacionChange(this));
    }

    public static Cotizacion from(CotizacionId entityId, List<DomainEvent> events) {
        var cotizacion = new Cotizacion(entityId);
        events.forEach(cotizacion::applyEvent);
        return cotizacion;
    }

    public void agregarAnalistaComercial(AnalistaComercialId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new AnalistaComercialAgregado(entityId, nombre)).apply();
    }

    public void agregarCliente(ClienteId entityId,Direccion direccion,Nombre nombre, CotizacionId cotizacionId) {
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cotizacionId);
        appendChange(new ClienteAgregado(entityId,direccion,nombre,cotizacionId)).apply();
    }

    public void actualizarDireccionDeUnCliente(ClienteId entityId, Direccion direccion) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(direccion);
        appendChange(new DireccionDeUnClienteActualizada(entityId, direccion)).apply();
    }

    public void agregarDiseñoPreliminar(DiseñoPreliminarId entityId, Precio precio, Informacion informacion) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(precio);
        Objects.requireNonNull(informacion);
        appendChange(new DiseñoPreliminarAgregado(entityId, precio, informacion)).apply();
    }

    public void actualizarNombreDeUnAnalistaComercial(AnalistaComercialId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreDeUnaAnalistaComercialActualizado(entityId, nombre)).apply();
    }

    public void actualizarNombreDeUnCliente(ClienteId entityId,Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreDeUnClienteActualizado(entityId, nombre)).apply();
    }

    public void actualizarPrecioDeUnDiseñoPreliminar(DiseñoPreliminarId entityId,Precio precio) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(precio);
        appendChange(new PrecioDeUnDiseñoPreliminarActualizado(entityId, precio)).apply();
    }

    public void actualizarInformacionDeUnDiseñoPreliminar(DiseñoPreliminarId entityId,Informacion informacion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(informacion);
        appendChange(new InformacionDeUnDiseñoPreliminarActualizada(entityId,informacion)).apply();
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
