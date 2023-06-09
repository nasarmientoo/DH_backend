package presencial.clase4_cadenaResponsabilidad_colmena;

public class ManejadorGerencial extends Manejador {
    @Override
    public String comprobar(Mail mail) {
        if(mail.getDestino().equals("gerencial@colmena.com") || mail.getTema().equals("Gerencial")){
            System.out.println("Lo atenderá en minutos el sector Gerencial");
            return "Usted está siendo atendido por el departamento Gerencial";
        } else {
            System.out.println("Mail paso por Gerencial");
            return  getSiguienteManejador().comprobar(mail);
        }
    }
}
