package presencial.clase8_facade_descuentoSuper;
//5
public class ApiProducto {
    public static int descuentoCantidad(Producto producto){
        if(producto.getTipo().equals("latas")){
            return 10;
        }
        else {
            return 0;
        }
    }
}
