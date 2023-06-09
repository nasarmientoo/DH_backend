package mesas.clase3_templateMethod_menuComida;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
    @Test
    public void PasosASeguir(){
        //Dado
        Empleado empleadoClasico = new EmpleadoClasico();
        Menu clasico = new Clasico(3.0);
        String expectativaRecetaClasico = "Asar, condimentar y unir todo";
        //Cuando
        String recetaRecibidaClasico = empleadoClasico.recetaMenu(clasico);
        //Entonces
        Assertions.assertEquals(expectativaRecetaClasico,recetaRecibidaClasico );
    }

    @Test
    public void calcularPrecioMenu(){
        Empleado empleadoClasico = new EmpleadoClasico();
        Menu clasico = new Clasico(3.0);
        double expectativaPrecio = 3;
        double precioCalculado = empleadoClasico.calcularCosto(clasico);
        Assertions.assertEquals(expectativaPrecio, precioCalculado);
    }
}