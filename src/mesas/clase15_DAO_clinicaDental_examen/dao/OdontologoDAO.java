package mesas.clase15_DAO_clinicaDental_examen.dao;

import mesas.clase15_DAO_clinicaDental_examen.model.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDAO implements IDao<Odontologo>{
    private List<Odontologo> odontologos;
    private static final Logger logger = Logger.getLogger(OdontologoDAO.class);

    public OdontologoDAO() {
        odontologos = new ArrayList<>();
    }

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        odontologos.add(odontologo);
        logger.info("Odontologo guardado exitosamente");
        return odontologo;
    }

    @Override
    public Odontologo buscar(int id) {
        return null;
    }

    @Override
    public void modificar(Odontologo odontologo) {

    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public List<Odontologo> listar() {
        logger.info("Odontologo listado exitosamente");
        return odontologos;
    }
}
