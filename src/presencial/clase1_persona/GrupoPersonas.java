package presencial.clase1_persona;

import java.util.ArrayList;
import java.util.List;

public class GrupoPersonas{
    private List<Persona> grupo;
    public GrupoPersonas(){
        grupo = new ArrayList<>();
    }

    public boolean esMayor(Persona persona){
        return persona.getEdad() >= 18;
    }

    public void agregarPersona(Persona persona){
        if(persona.getEdad() >= 18) {
            grupo.add(persona);
        }
    }


    public String nombreCompleto(Persona persona){
        return persona.getApellido() + " " +  persona.getNombre();
    }

}
