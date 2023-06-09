package mesas.clase3_templateMethod_menuComida;

public abstract class Empleado {
    public String armarPaquete(Menu menu){
        return recetaMenu(menu) + calcularCosto(menu);
    }

    protected abstract Double calcularCosto(Menu menu);
    protected abstract String recetaMenu(Menu menu);
}
