package presencial.clase7_flyweight_computadoras;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {
    private static Map<String, Computadora> computadoraMap;
    public ComputadoraFactory() {
        computadoraMap = new HashMap<>();
    }

    public Computadora getComputadora(Integer ram, Integer discoDuro){
        //creo la clave
        String clave="key:"+ram+":"+discoDuro;
        if(!computadoraMap.containsKey(clave)){
            //Si no existe la clave crear una nueva computadora con esa clave
            computadoraMap.put(clave, new Computadora(ram, discoDuro,clave));
        }
        return computadoraMap.get(clave);
    }
}
