package presencial.clase8_facade_descuentoSuper;
//4
public class FacadeDescuento implements Descuento {
    @Override
    public int calcularDescuento(Tarjeta tarjeta, Producto producto, int cantidad) {
        int descuento = 0;
        //Acá interactuan todas las apis que deseo simplificar
        descuento = descuento + ApiCantidad.descuentoCantidad(cantidad);
        descuento = descuento + ApiProducto.descuentoCantidad(producto);
        descuento = descuento + ApiTarjeta.descuentoTarjeta(tarjeta);

        return descuento;
    }
}
