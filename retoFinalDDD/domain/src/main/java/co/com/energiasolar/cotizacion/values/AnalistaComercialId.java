package co.com.energiasolar.cotizacion.values;

import co.com.sofka.domain.generic.Identity;

public class AnalistaComercialId extends Identity {
    public AnalistaComercialId(){

    }
    private AnalistaComercialId(String id){
        super(id);
    }
    public static AnalistaComercialId of(String id){
        return new AnalistaComercialId(id);
    }
}
