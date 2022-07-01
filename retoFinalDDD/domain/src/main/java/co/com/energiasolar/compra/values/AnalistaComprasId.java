package co.com.energiasolar.compra.values;

import co.com.sofka.domain.generic.Identity;

public class AnalistaComprasId extends Identity {
    public AnalistaComprasId(){

    }
    private AnalistaComprasId(String id){
        super(id);
    }
    public static AnalistaComprasId of(String id){
        return new AnalistaComprasId(id);
    }
}
