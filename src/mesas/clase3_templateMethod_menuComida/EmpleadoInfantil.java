package mesas.clase3_templateMethod_menuComida;

public class EmpleadoInfantil extends Empleado{
    @Override
    protected Double calcularCosto(Menu menu) {
        Double respuesta = menu.getPrecioBase();
        if(menu instanceof  Infantil){
            Infantil menuInfantil = (Infantil) menu;
            respuesta = respuesta + (3 * menuInfantil.getCantJuguetes());
        }
        return null;
    }

    @Override
    protected String recetaMenu(Menu menu) {
        return "Asar, condimenar y sumar los juguetes necesarios";
    }
}
