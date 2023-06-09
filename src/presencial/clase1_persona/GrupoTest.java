package presencial.clase1_persona;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    public void agregarPersonasTest(){
        Persona Nataly = new Persona("Nataly", "Sarmiento", "nasarmientoo@gmail.com",23);
        Persona Paula = new Persona("Paula", "Sarmiento", "pjsarmientoo@gmail.com",28);
        Persona Nicolas = new Persona("Nicolas", "Sarmiento", "ansarmientoo@gmail.com",24);

        GrupoPersonas grupo = new GrupoPersonas();

        grupo.agregarPersona(Nataly);
        grupo.agregarPersona(Paula);
        grupo.agregarPersona(Nicolas);

        assertTrue(grupo.esMayor(Nataly));
        assertEquals("Sarmiento Nicolas", grupo.nombreCompleto(Nicolas));
    }
}