package presencial.clase4_cadenaResponsabilidad_colmena;

public class ManejadorTecnico extends Manejador{
    @Override
    public String comprobar(Mail mail) {
        if(mail.getDestino().equals("tecnico@colmena.com") || mail.getTema().equals("Técnico")){
            System.out.println("Lo atenderá en minutos el sector Técnico");
            return "Usted está siendo atendido por el departamento Técnico";
        } else {
            System.out.println("Mail paso por Técnico");
            return  getSiguienteManejador().comprobar(mail);
        }
    }
}
