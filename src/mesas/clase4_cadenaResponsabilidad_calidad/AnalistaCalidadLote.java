package mesas.clase4_cadenaResponsabilidad_calidad;

public class AnalistaCalidadLote extends AnalistaCalidad{

    @Override
    public String comprobarCalidad(Articulo articulo) {
        if(articulo.getLote()>=1000 && articulo.getLote()<=2000){
            System.out.println("Control lote cumple el estandar de calidad");
            return getSiguienteAnalistaCalidad().comprobarCalidad(articulo);
        }else {
            return "Artículo rechazado en control de lote";
        }
    }
}
