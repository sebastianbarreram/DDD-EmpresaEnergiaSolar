package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.diseño.values.IngenieroId;
import co.com.energiasolar.diseño.values.Nombre;
import co.com.energiasolar.diseño.values.Sede;
import co.com.sofka.domain.generic.Command;

public class CambiarSede extends Command {
    private final Sede sede;

    public CambiarSede(Sede sede) {
        this.sede = sede;
    }

    public Sede getSede() {
        return sede;
    }
}
