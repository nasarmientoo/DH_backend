package presencial.clase5_proxy_vacunacion;
//3
public class Enfermero implements CentroSalud{
    @Override
    public String vacunar(Persona persona) {
        persona.setCantDosis(persona.getCantDosis()+1);
        return "Se ha registrado el documento " + persona.getDocumento() + " como persona vacunada con la vacuna "
                + persona.getNombreVacuna();
    }
}
