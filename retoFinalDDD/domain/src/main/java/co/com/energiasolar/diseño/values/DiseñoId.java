package co.com.energiasolar.diseño.values;

import co.com.sofka.domain.generic.Identity;

public class DiseñoId extends Identity {
    public DiseñoId(){

    }
    private DiseñoId(String id){
        super(id);
    }
    public static DiseñoId of(String id){
        return new DiseñoId(id);
    }
}
