package co.com.energiasolar.diseño.values;

import co.com.sofka.domain.generic.Identity;

public class IngenieroId extends Identity {
    public IngenieroId(){

    }
    private IngenieroId(String id){
        super(id);
    }
    public static IngenieroId of(String id){
        return new IngenieroId(id);
    }
}
