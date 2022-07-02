package co.com.energiasolar.compra.commands;

import co.com.energiasolar.compra.values.CompraId;
import co.com.sofka.domain.generic.Command;

public class CrearCompra extends Command {
    private final CompraId entityId;

    public CrearCompra(CompraId entityId) {
        this.entityId=entityId;
    }

    public CompraId getEntityId() {
        return entityId;
    }
}
