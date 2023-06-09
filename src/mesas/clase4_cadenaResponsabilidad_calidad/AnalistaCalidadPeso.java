package mesas.clase4_cadenaResponsabilidad_calidad;

public class AnalistaCalidadPeso extends AnalistaCalidad {
    @Override
    public String comprobarCalidad(Articulo articulo) {
        if(articulo.getPeso()>=1200 && articulo.getPeso()<=1300){
            System.out.println("Control peso cumple el estandar de calidad");
            return getSiguienteAnalistaCalidad().comprobarCalidad(articulo);
        }else {
            return "Artículo rechazado en control de peso";
        }
    }
}
