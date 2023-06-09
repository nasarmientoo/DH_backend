package mesas.clase15_DAO_clinicaDental_examen.test;

import mesas.clase15_DAO_clinicaDental_examen.bd.BD;
import mesas.clase15_DAO_clinicaDental_examen.dao.PacienteDAOH2;
import mesas.clase15_DAO_clinicaDental_examen.model.Paciente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import mesas.clase15_DAO_clinicaDental_examen.service.PacienteService;

import java.util.List;

public class PacienteServiceTest {
    @Test
    public void TestBuscarTodos(){
        //DADO
        BD.crearTablas();
        PacienteService pacienteService= new PacienteService(new PacienteDAOH2());
        //CUANDO
        List<Paciente> pacientes= pacienteService.listarPacientes();
        //ENTONCES
        Assertions.assertEquals(2,pacientes.size());
    }
    @Test
    public void testBuscar(){
        BD.crearTablas();
        PacienteService pacienteService= new PacienteService(new PacienteDAOH2());
        Integer idABuscar=2;
        Paciente paciente= pacienteService.buscarPaciente(idABuscar);
        Assertions.assertTrue(paciente!=null);
    }
}
