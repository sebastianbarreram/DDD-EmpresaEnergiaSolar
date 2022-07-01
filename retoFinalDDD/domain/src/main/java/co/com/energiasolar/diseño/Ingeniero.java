package co.com.energiasolar.diseño;

import co.com.energiasolar.diseño.values.IngenieroId;
import co.com.energiasolar.diseño.values.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Ingeniero extends Entity<IngenieroId> {
    private Nombre nombre;

    public Ingeniero(IngenieroId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public void actualizarNombre(Nombre nombre) {
        this.nombre = nombre;
    }
}
