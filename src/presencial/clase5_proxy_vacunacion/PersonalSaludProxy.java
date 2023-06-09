package presencial.clase5_proxy_vacunacion;

import java.util.Date;

//4
public class PersonalSaludProxy implements CentroSalud{
    private Enfermero enfermero;

    public PersonalSaludProxy() {
        //No lo ponemos como paramatero sino que nos aseguramos de que siempre haya un enfermero
        this.enfermero = new Enfermero();
    }

    @Override
    public String vacunar(Persona persona) {
        Date hoy = new Date();
        String mensaje = "Vuelva cuando sea su turno";
        if (hoy.after(persona.getFechaAsignada())){
            mensaje = enfermero.vacunar(persona);
        }
        return mensaje;
    }
}
