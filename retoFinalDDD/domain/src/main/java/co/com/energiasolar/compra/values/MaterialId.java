package co.com.energiasolar.compra.values;

import co.com.sofka.domain.generic.Identity;

public class MaterialId extends Identity {
    public MaterialId(){

    }
    private MaterialId(String id){
        super(id);
    }
    public static MaterialId of(String id){
        return new MaterialId(id);
    }
}
