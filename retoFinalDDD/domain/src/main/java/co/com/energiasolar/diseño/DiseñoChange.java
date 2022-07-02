package co.com.energiasolar.diseño;

import co.com.energiasolar.compra.Proveedor;
import co.com.energiasolar.compra.events.ProveedorAgregado;
import co.com.energiasolar.diseño.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class DiseñoChange extends EventChange {
    public DiseñoChange(Diseño diseño) {
        apply((DiseñoCreado envent) -> {
            diseño.compras = new HashSet<>();
            diseño.sede=envent.getSede();
            diseño.ingenieros=new HashSet<>();
        });

        apply((AnalisisDeSombraAgregado event)->{
            diseño.agregarAnalisisDeSombra(event.getEntityId(),event.getInformacion());
        });

        apply((CotizacionAsociada event) -> {
            diseño.cotizacionId= event.getCotizacionId();
        });

        apply((InformacionDeUnAnalisisDeSombraActualizada event)->{
            diseño.actualizarInformacionDeUnAnalisisDeSombra(event.getEntityId(), event.getInformacion());
        });

        apply((InformacionDeUnProyectoSolarActualizada event)->{
            diseño.actualizarInformacionDeUnProyectoSolar(event.getEntityId(), event.getInformacion());
        });

        apply((AnalisisDeSombraAgregado event)->{
            diseño.agregarAnalisisDeSombra(event.getEntityId(),event.getInformacion());
        });

        apply((IngenieroAgregado event)->{
            diseño.agregarIngenieros((new Ingeniero(
                    event.getEntityId(),
                    event.getNombre(),
                    event.getDiseñoId()
            )));
        });

        apply((NombreDeUnIngenieroActualizado event)->{
            var ingeniero=diseño.getIngenieroPorId(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el ingeniero del diseño"));
            ingeniero.actualizarNombre(event.getNombre());
        });

        apply((ProyectoSolarAgregado event)->{
            diseño.agregarProyectoSolar(event.getEntityId(),event.getInformacion());
        });

        apply((SedeCambiada event)->{
            diseño.sede= event.getSede();
        });






    }
}
