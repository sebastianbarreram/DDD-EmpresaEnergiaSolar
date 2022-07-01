package co.com.energiasolar.diseño.values;

import co.com.sofka.domain.generic.Identity;

public class ProyectoSolarId extends Identity {
    public ProyectoSolarId(){

    }
    private ProyectoSolarId(String id){
        super(id);
    }
    public static ProyectoSolarId of(String id){
        return new ProyectoSolarId(id);
    }
}
