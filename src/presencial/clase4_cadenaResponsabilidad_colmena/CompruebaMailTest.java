package presencial.clase4_cadenaResponsabilidad_colmena;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompruebaMailTest {
    @Test
    public void mailASpam(){
        CompruebaMail colmena = new CompruebaMail();
        Mail mail = new Mail("nasarmientoo@gmail.com", "pjsarmientoo@gmail.com", "PQR");
        String expectativaRespuesta = "Mail se marco como SPAM";
        String respuesta = colmena.compruebaMail(mail);
        Assertions.assertEquals(expectativaRespuesta,respuesta);
    }

}