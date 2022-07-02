package co.com.energiasolar.diseño.commands;

import co.com.energiasolar.diseño.values.DiseñoId;
import co.com.energiasolar.diseño.values.IngenieroId;
import co.com.energiasolar.diseño.values.Nombre;
import co.com.energiasolar.diseño.values.Sede;
import co.com.sofka.domain.generic.Command;

public class CambiarSede extends Command {
    private final Sede sede;
    private final DiseñoId diseñoId;


    public CambiarSede(Sede sede, DiseñoId diseñoId) {

        this.sede = sede;
        this.diseñoId = diseñoId;
    }

    public Sede getSede() {
        return sede;
    }

    public DiseñoId getDiseñoId() {
        return diseñoId;
    }
}
