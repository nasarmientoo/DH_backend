package presencial.clase10_log4j_listaEnteros;

import org.apache.log4j.PropertyConfigurator;

public class Cliente {
    public static void main(String[] args){
        Lista listado = new Lista();
        for (int i=0; i<6;i++){
            listado.agregarEnteros(i);
        }
    }
}
