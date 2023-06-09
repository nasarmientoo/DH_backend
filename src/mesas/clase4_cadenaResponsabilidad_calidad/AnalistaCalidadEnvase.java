package mesas.clase4_cadenaResponsabilidad_calidad;

public class AnalistaCalidadEnvase extends AnalistaCalidad{
    @Override
    public String comprobarCalidad(Articulo articulo) {
        if(articulo.getEnvasado().equals("sano") || articulo.getEnvasado().equals("casi sano")){
            System.out.println("Control Envase cumple el estandar de calidad");
            return "Artículo aceptado en control de Envase";
        }else {;
            return "Artículo rechazado en control de Envase";
        }
    }
}
