package presencial.clase14_DAO_medicamentos;

import presencial.clase14_DAO_medicamentos.dao.MedicamentoDAOH2;
import presencial.clase14_DAO_medicamentos.dao.bd;
import presencial.clase14_DAO_medicamentos.model.Medicamento;
import presencial.clase14_DAO_medicamentos.service.MedicamentoService;

public class Main {
    public static void main(String[] args) {
        //Creamos la tabla
        bd.crearTabla();
        //Preparamos el medicamento
        Medicamento medicamento = new Medicamento(1,12345,"Ibuprofeno", "Bayer", 2, 2500.0);
        //¿Quién interviene para guardarlo?
        MedicamentoService medicamentoService = new MedicamentoService(new MedicamentoDAOH2());
        //Service lo guarda
        medicamentoService.guardarMedicamento(medicamento);
    }
}
