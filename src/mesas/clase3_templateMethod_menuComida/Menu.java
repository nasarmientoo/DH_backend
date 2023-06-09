package mesas.clase3_templateMethod_menuComida;

public abstract class Menu {
    private Double precioBase;

    public Menu(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }
}
