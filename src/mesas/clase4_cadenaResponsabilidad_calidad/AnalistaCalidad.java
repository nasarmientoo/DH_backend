package mesas.clase4_cadenaResponsabilidad_calidad;

public abstract class AnalistaCalidad {
    private AnalistaCalidad siguienteAnalistaCalidad;

    public AnalistaCalidad getSiguienteAnalistaCalidad() {
        return siguienteAnalistaCalidad;
    }

    public void setSiguienteAnalistaCalidad(AnalistaCalidad siguienteAnalistaCalidad) {
        this.siguienteAnalistaCalidad = siguienteAnalistaCalidad;
    }

    public abstract String comprobarCalidad(Articulo articulo);
}
