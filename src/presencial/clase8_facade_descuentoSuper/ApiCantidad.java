package presencial.clase8_facade_descuentoSuper;
//7
public class ApiCantidad {
    public static int descuentoCantidad(int cantidad){
        if(cantidad > 12){
            return 15;
        }
        else {
            return 0;
        }
    }
}
