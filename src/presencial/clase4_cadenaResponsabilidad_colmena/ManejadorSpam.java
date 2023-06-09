package presencial.clase4_cadenaResponsabilidad_colmena;

public class ManejadorSpam extends Manejador{

    @Override
    public String comprobar(Mail mail) {
        System.out.println("Mail es SPAM");
        return  "Mail se marco como SPAM";
    }
}
