package mesas.clase7_flyweight_arboles;

public class Arbol {
    private Double alto;
    private Double ancho;
    private String color;
    private String tipo;
    private static Integer contador = 0;

    public Arbol(Double alto, Double ancho, String color, String tipo) {
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
        this.tipo = tipo;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Arbol.contador = contador;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
