package co.com.energiasolar.diseño;

import co.com.energiasolar.compra.Compra;
import co.com.energiasolar.compra.values.CompraId;
import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.diseño.events.*;
import co.com.energiasolar.diseño.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Diseño extends AggregateEvent<DiseñoId> {
    protected CotizacionId cotizacionId;
    protected Set<Compra> compras;
    protected Sede sede;

    protected Set<Ingeniero> ingenieros;

    public Diseño(DiseñoId entityId, CotizacionId cotizacionId, Sede sede) {
        super(entityId);
        this.cotizacionId = cotizacionId;
        this.compras = compras;
        this.sede = sede;
        appendChange(new DiseñoCreado(entityId,cotizacionId,sede)).apply();
    }

    public void agregarIngeniero(IngenieroId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new IngenieroCreado(entityId,nombre)).apply();
    }

    public void cambiarSede(Sede sede){
        Objects.requireNonNull(sede);
        appendChange(new SedeCambiada(sede)).apply();
    }

    public void asociarCotizacion(CotizacionId cotizacionId){
        Objects.requireNonNull(cotizacionId);
        appendChange(new CotizacionAsociada(cotizacionId)).apply();
    }

    public void actualizarInformacionDeUnAnalisisDeSombra(AnalisisDeSombraId entityId, Informacion informacion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(informacion);
        appendChange(new InformacionDeUnAnalisisDeSombraActualizada(entityId, informacion)).apply();
    }

    public void actualizarNombreDeUnIngeniero(IngenieroId entityId, Nombre nombre){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreDeUnIngenieroActualizado(entityId,nombre)).apply();

    }

    public void actualizarInformacionDeUnProyectoSolar(ProyectoSolarId entityId, Informacion informacion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(informacion);
        appendChange(new InformacionDeUnProyectoSolarActualizada(entityId,informacion)).apply();

    }

    protected Optional<Compra> getCompraPorId(CompraId compraId) {
        return compras()
                .stream()
                .filter(material -> material.identity().equals(compraId))
                .findFirst();
    }


    public CotizacionId cotizacionId() {
        return cotizacionId;
    }

    public Set<Compra> compras() {
        return compras;
    }

    public Sede sede() {
        return sede;
    }

    public Set<Ingeniero> ingenieros() {
        return ingenieros;
    }
}
