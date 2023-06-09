package presencial.clase8_facade_descuentoSuper;
//8
public class Cliente {
    public static void main(String[] args){
        FacadeDescuento fachada = new FacadeDescuento();

        Tarjeta tarjeta = new Tarjeta("123456", "star bank");
        Producto producto = new Producto("arbejas", "latas");
        int cantidad = 5;

        System.out.println("Descuentos acumulados: " + fachada.calcularDescuento(tarjeta, producto, cantidad));
    }
}
