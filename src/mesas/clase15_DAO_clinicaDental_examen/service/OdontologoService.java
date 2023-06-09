package mesas.clase15_DAO_clinicaDental_examen.service;

import mesas.clase15_DAO_clinicaDental_examen.dao.IDao;
import mesas.clase15_DAO_clinicaDental_examen.model.Odontologo;

import java.util.List;

public class OdontologoService {
    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }
    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoIDao.guardar(odontologo);
    }

    public Odontologo buscarOdontologo(int id){
        return odontologoIDao.buscar(id);
    }
    public void modificarOdontologo(Odontologo odontologo){
        odontologoIDao.modificar(odontologo);
    }
    public void eliminarOdontologo(int id){
        odontologoIDao.eliminar(id);
    }

    public List<Odontologo> listarOdontologos(){
        return odontologoIDao.listar();
    }

}
