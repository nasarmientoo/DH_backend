package presencial.clase10_log4j_listaEnteros;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    //inyectamos al log4j
    private static final Logger logger = Logger.getLogger(Lista.class);
    private List<Integer> listaEnteros;

    public Lista(){
        listaEnteros = new ArrayList<>();
        //necesitamos método para agregar números a la lista
    }

    public void agregarEnteros(Integer numero){
        listaEnteros.add(numero);
        if(listaEnteros.size()>5){
            //necesito logger, guardarlo en mi vitacora
            logger.info("La lista creada tiene: " + listaEnteros.size() + ". Supera los 5");
        }
    }


}
