package co.com.energiasolar.cotizacion;

import co.com.energiasolar.cotizacion.events.*;
import co.com.energiasolar.diseño.Diseño;
import co.com.sofka.domain.generic.EventChange;

public class CotizacionChange extends EventChange {
    public CotizacionChange(Cotizacion cotizacion) {

        apply((AnalistaComercialAgregado event) -> {
            cotizacion.agregarAnalistaComercial(
                    event.getEntityId(),
                    event.getNombre()
            );
        });

        apply((ClienteAgregado event) -> {
            cotizacion.agregarCliente(
                    event.getEntityId(),
                    event.getDireccion(),
                    event.getNombre()
            );
        });

        apply((DireccionDeUnClienteActualizada event) -> {
            cotizacion.actualizarDireccionDeUnCliente(
                    event.getEntityId(),
                    event.getDireccion());
        });

        apply((DiseñoPreliminarAgregado event) -> {
            cotizacion.agregarDiseñoPreliminar(
                    event.getEntityId(),
                    event.getPrecio(),
                    event.getInformacion()
            );
        });

        apply((NombreDeUnaAnalistaComercialActualizado event) -> {
            cotizacion.actualizarNombreDeUnAnalistaComercial(
                    event.getEntityId(),
                    event.getNombre());
        });

        apply((NombreDeUnClienteActualizado event) -> {
            cotizacion.actualizarNombreDeUnCliente(
                    event.getEntityId(),
                    event.getNombre());
        });

        apply((PrecioDeUnDiseñoPreliminarActualizado event) -> {
            cotizacion.actualizarPrecioDeUnDiseñoPreliminar(
                    event.getEntityId(),
                    event.getPrecio());
        });

        apply((InformacionDeUnDiseñoPreliminarActualizada event) -> {
            cotizacion.actualizarInformacionDeUnDiseñoPreliminar(
                    event.getEntityId(),
                    event.getInformacion());
        });


    }
}
