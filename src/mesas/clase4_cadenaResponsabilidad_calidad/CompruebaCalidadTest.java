package mesas.clase4_cadenaResponsabilidad_calidad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CompruebaCalidadTest {
    @Test
    public void validarCalidadProducto(){
        CompruebaCalidad pruebaCalidad = new CompruebaCalidad();
        Articulo articulo = new Articulo("Rare Beauty", 1200, 1270, "sano");
        String expectativaResultado = "Artículo aceptado en control de Envase";
        String actualResultado = pruebaCalidad.compruebaCalidad(articulo);
        Assertions.assertEquals(expectativaResultado,actualResultado);
    }

}