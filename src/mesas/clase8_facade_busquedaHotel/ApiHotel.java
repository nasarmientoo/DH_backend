package mesas.clase8_facade_busquedaHotel;

public class ApiHotel {
    public static String busquedaHotel (String fechaEntrada, String fechaSalida, String ciudad){
        return "Encontramos el hotel" + fechaEntrada + fechaSalida + ciudad;
    }
}
