package co.com.energiasolar.diseño;

import co.com.energiasolar.compra.Compra;
import co.com.energiasolar.compra.values.CompraId;
import co.com.energiasolar.cotizacion.events.CotizacionCreada;
import co.com.energiasolar.cotizacion.values.CotizacionId;
import co.com.energiasolar.diseño.events.*;
import co.com.energiasolar.diseño.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Diseño extends AggregateEvent<DiseñoId> {
    protected CotizacionId cotizacionId;
    protected Set<Compra> compras;
    protected Sede sede;

    protected Set<Ingeniero> ingenieros;

    public Diseño(DiseñoId entityId, Sede sede) {
        super(entityId);
        appendChange(new DiseñoCreado(sede)).apply();
    }

    private Diseño(DiseñoId entityId) {
        super(entityId);
        subscribe(new DiseñoChange(this));
    }

    public static Diseño from(DiseñoId entityId, List<DomainEvent> events) {
        var diseño = new Diseño(entityId);
        events.forEach(diseño::applyEvent);
        return diseño;
    }

    public void agregarAnalisisDeSombra(AnalisisDeSombraId entityId, Informacion informacion) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(informacion);
        appendChange(new AnalisisDeSombraAgregado(entityId, informacion)).apply();
    }

    public void asociarCotizacion(CotizacionId cotizacionId) {
        Objects.requireNonNull(cotizacionId);
        appendChange(new CotizacionAsociada(cotizacionId)).apply();
    }

    public void actualizarInformacionDeUnAnalisisDeSombra(AnalisisDeSombraId entityId, Informacion informacion) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(informacion);
        appendChange(new InformacionDeUnAnalisisDeSombraActualizada(entityId, informacion)).apply();
    }

    public void actualizarInformacionDeUnProyectoSolar(ProyectoSolarId entityId, Informacion informacion) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(informacion);
        appendChange(new InformacionDeUnProyectoSolarActualizada(entityId, informacion)).apply();
    }

    public void agregarIngeniero(IngenieroId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new IngenieroAgregado(entityId, nombre)).apply();
    }

    public void actualizarNombreDeUnIngeniero(IngenieroId entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreDeUnIngenieroActualizado(entityId, nombre)).apply();
    }

    public void agregarProyectoSolar(ProyectoSolarId entityId, Informacion informacion) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(informacion);
        appendChange(new ProyectoSolarAgregado(entityId, informacion)).apply();
    }

    public void cambiarSede(Sede sede) {
        Objects.requireNonNull(sede);
        appendChange(new SedeCambiada(sede)).apply();
    }

    protected Optional<Compra> getCompraPorId(CompraId compraId) {
        return compras()
                .stream()
                .filter(compra -> compra.identity().equals(compraId))
                .findFirst();
    }

    protected Optional<Ingeniero> getIngenieroPorId(IngenieroId ingenieroId) {
        return ingenieros()
                .stream()
                .filter(ingeniero -> ingeniero.identity().equals(ingenieroId))
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
