package co.com.energiasolar.diseño.values;

import co.com.sofka.domain.generic.Identity;

public class AnalisisDeSombraId extends Identity {
    public AnalisisDeSombraId(){

    }
    private AnalisisDeSombraId(String id){
        super(id);
    }
    public static AnalisisDeSombraId of(String id){
        return new AnalisisDeSombraId(id);
    }
}
