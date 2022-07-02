package co.com.energiasolar.compra;

import co.com.energiasolar.compra.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class CompraChange extends EventChange {
    //estado inicial al momento de crear el agregado
    public CompraChange(Compra compra) {
        apply((CompraCreada envent) -> {
            compra.proveedores = new HashSet<>();
        });

        apply((AnalistaDeComprasAgregado event) -> {
            compra.agregarAnalistaCompras(
                    event.getEntityId(),
                    event.getNombre()
            );
        });

        apply((DescripcionDeUnMaterialActualizada event) -> {
            var proveedor = compra.getProveedorPorId(event.getProveedorId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el proveedor de la compra"));
            proveedor.cambiarDescripcionDeUnMaterial(event.getEntityId(), event.getDescripcion());
        });

        apply((MaterialDeUnProveedorAgregado event) -> {
            var proveedor = compra.getProveedorPorId(event.getProveedorId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el proveedor de la compra"));
            proveedor.agregarMaterial(
                    event.getEntityId(),
                    event.getPrecio(),
                    event.getDescripcion()
            );
        });

        apply((NombreDeUnAnalistaComprasActualizado event) -> {
            compra.actualizarNombreDeUnAnalistaCompras(event.getEntityId(), event.getNombre());
        });

        apply((NombreDeUnPorveedorActualizado event) -> {
            var proveedor = compra.getProveedorPorId(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el proveedor de la compra"));
            proveedor.cambiarNombre(event.getNombre());
        });

        apply((PrecioDeUnMaterialActualizado event) -> {
            var proveedor = compra.getProveedorPorId(event.getProveedorId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el proveedor de la compra"));
            proveedor.cambiarPrecioDeUnMaterial(event.getEntityId(), event.getPrecio());
        });

        apply((ProveedorAgregado event)->{
            compra.proveedores.add(new Proveedor(
                    event.getEntityId(),
                    event.getNombre(),
                    event.getCompraId()
            ));
        });
    }
}
