package presencial.clase5_proxy_vacunacion;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CentroSaludTest {

    @Test
    public void vacunarNataly(){
        Persona nataly = new Persona("Nataly", "Sarmiento", "1032505860", 0,"Astrazeneca", new Date(2023-1900, Calendar.MAY,1));
        PersonalSaludProxy administrativo = new PersonalSaludProxy();
        String respEsperada = "Se ha registrado el documento 1032505860 como persona vacunada con la vacuna Astrazeneca";
        String respActual = administrativo.vacunar(nataly);

        assertEquals(respEsperada, respActual);
    }

}