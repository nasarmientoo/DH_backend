package presencial.clase4_cadenaResponsabilidad_colmena;

public class CompruebaMail {

    //Vinculo compueba mail y manejador
    private Manejador inicial;

    public CompruebaMail() {
        //No inicializamos Manejador
        inicial = new ManejadorGerencial();
        Manejador tecnico = new ManejadorTecnico();
        Manejador comercial = new ManejadorComercial();
        Manejador spam = new ManejadorSpam();

        inicial.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(comercial);
        comercial.setSiguienteManejador(spam);
    }

    public String compruebaMail(Mail mail){
        return inicial.comprobar(mail);
    }

    public Manejador getInicial() {
        return inicial;
    }

    public void setInicial(Manejador inicial) {
        this.inicial = inicial;
    }
}
