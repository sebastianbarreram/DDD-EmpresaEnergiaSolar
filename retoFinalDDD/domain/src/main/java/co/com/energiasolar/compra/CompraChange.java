package co.com.energiasolar.compra;

import co.com.energiasolar.compra.events.AnalistaDeComprasAgregado;
import co.com.energiasolar.compra.events.CompraCreada;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class CompraChange extends EventChange {
    //estado inicial al momento de crear el agregado
    public CompraChange(Compra compra) {
        apply((CompraCreada envent) -> {
            compra.proveedores = new HashSet<>();
            compra.materiales = new HashSet<>();
        });

//        apply((AnalistaDeComprasAgregado event)->{
//            compra.agregarAnalistaCompras(
//
//            ));
//        });

    }
}
