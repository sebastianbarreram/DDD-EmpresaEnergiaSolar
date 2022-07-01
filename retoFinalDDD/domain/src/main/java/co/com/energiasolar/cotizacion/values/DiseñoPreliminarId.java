package co.com.energiasolar.cotizacion.values;


import co.com.sofka.domain.generic.Identity;

public class DiseñoPreliminarId extends Identity {
    public DiseñoPreliminarId(){

    }
    private DiseñoPreliminarId(String id){
        super(id);
    }
    public static DiseñoPreliminarId of(String id){
        return new DiseñoPreliminarId(id);
    }
}
