package mesas.clase7_flyweight_arboles;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    private static Map<String, Arbol> arbolMap;
    public ArbolFactory() {arbolMap = new HashMap<>();}

    public Arbol plantarArbol(Double alto, Double ancho, String color){
        String tipoArbol = "";
        if(alto == 100 && ancho == 200 && color.equals("celeste")){
            tipoArbol = "Florales";
        } else if (alto == 500 && ancho == 300 && color.equals("rojo")) {
            tipoArbol = "Rojo";
        } else if (alto == 200 && ancho == 400 && color.equals("verde")) {
            tipoArbol = "Ornamental";
        } else{
            arbolMap.put(tipoArbol, new Arbol(alto, ancho, color, tipoArbol));
        }
        return arbolMap.get(tipoArbol);
    }

}
