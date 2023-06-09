package presencial.clase8_facade_descuentoSuper;
//6
public class ApiTarjeta {
    public static int descuentoTarjeta(Tarjeta tarjeta){
        if(tarjeta.getBanco().equals("star bank")){
            return 20;
        }else {
            return 0;
        }
    }
}
