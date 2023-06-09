package mesas.clase3_templateMethod_menuComida;

public class EmpleadoClasico extends Empleado{
    @Override
    protected Double calcularCosto(Menu menu) {
        return menu.getPrecioBase();
    }

    @Override
    protected String recetaMenu(Menu menu) {
        return "Asar, condimentar y unir todo";
    }
}
