package mesas.clase3_templateMethod_menuComida;

public class EmpleadoVegetariano extends Empleado{
    @Override
    protected Double calcularCosto(Menu menu) {
        Double respuesta = menu.getPrecioBase();
        if (menu instanceof Vegetariano){
            Vegetariano menuVegetariano = (Vegetariano) menu;
            if (menuVegetariano.getTieneEspecias()){
                respuesta = respuesta + (0.01 * menu.getPrecioBase());
            }else if (menuVegetariano.getCantSalsas() > 0){
                respuesta = respuesta + (2 * menuVegetariano.getCantSalsas());
            }else if (menuVegetariano.getTieneEspecias() && menuVegetariano.getCantSalsas() > 0){
                respuesta = respuesta + (2 * menuVegetariano.getCantSalsas()) + (0.01 * menu.getPrecioBase());
            }
        }
        return respuesta;
    }

    @Override
    protected String recetaMenu(Menu menu) {
        return "Asar, condimenar y sumar las especias y salsas";
    }
}
