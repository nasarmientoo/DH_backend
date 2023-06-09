package presencial.clase14_DAO_medicamentos.service;

import presencial.clase14_DAO_medicamentos.dao.iDao;
import presencial.clase14_DAO_medicamentos.model.Medicamento;

public class MedicamentoService {
    private iDao<Medicamento> medicamentoiDao;

    public MedicamentoService(iDao<Medicamento> medicamentoiDao) {
        this.medicamentoiDao = medicamentoiDao;
    }

    //Creamos los métodos que van a funcionar con el DAO
    public Medicamento guardarMedicamento(Medicamento medicamento){
        return medicamentoiDao.guardar(medicamento);
    }
}
