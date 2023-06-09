package mesas.clase15_DAO_clinicaDental_examen.test;

import mesas.clase15_DAO_clinicaDental_examen.bd.BD;
import mesas.clase15_DAO_clinicaDental_examen.dao.OdontologoDAO;
import mesas.clase15_DAO_clinicaDental_examen.dao.OdontologoDAOH2;
import mesas.clase15_DAO_clinicaDental_examen.model.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import mesas.clase15_DAO_clinicaDental_examen.service.OdontologoService;

import java.util.List;

public class OdontologoServiceTest {
    @Test
    public void listarOdontologosTestH2() {
        BD.crearTablas();
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        Assertions.assertEquals(1, odontologos.size());
    }

    @Test
    public void guardarOdontologoTestH2() {
        BD.crearTablas();
        Odontologo nuevoOdontologo = new Odontologo("AF456", "Nataly", "Sarmiento");
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());
        odontologoService.guardarOdontologo(nuevoOdontologo);
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        Assertions.assertEquals(2, odontologos.size());
    }

    @Test
    public void guardarOdontologoTest() {
        Odontologo nuevoOdontologo = new Odontologo(1,"UM569", "Paula", "Jimenez");
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAO());
        odontologoService.guardarOdontologo(nuevoOdontologo);
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        Assertions.assertEquals(1, odontologos.size());
    }

    @Test
    public void listarOdontologosTest(){
        Odontologo nuevoOdontologo1 = new Odontologo(1,"UM561", "Paula", "Jimenez");
        Odontologo nuevoOdontologo2 = new Odontologo(2,"UM562", "Gloria", "Sarmiento");
        Odontologo nuevoOdontologo3 = new Odontologo(3,"UM563", "Ana", "Gomez");
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAO());
        odontologoService.guardarOdontologo(nuevoOdontologo1);
        odontologoService.guardarOdontologo(nuevoOdontologo2);
        odontologoService.guardarOdontologo(nuevoOdontologo3);
        List<Odontologo> odontologos = odontologoService.listarOdontologos();
        Assertions.assertEquals(3, odontologos.size());
    }
}
