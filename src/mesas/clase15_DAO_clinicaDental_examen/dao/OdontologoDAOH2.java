package mesas.clase15_DAO_clinicaDental_examen.dao;

import mesas.clase15_DAO_clinicaDental_examen.bd.BD;
import mesas.clase15_DAO_clinicaDental_examen.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOH2 implements IDao<Odontologo>{
    private static final String SQL_SELECT_ALL="SELECT * FROM ODONTOLOGOS";
    private static final String SQL_INSERT="INSERT INTO ODONTOLOGOS VALUES(?,?,?,?)";

    private static final Logger logger = Logger.getLogger(OdontologoDAOH2.class);
    @Override
    public Odontologo guardar(Odontologo odontologo) {
        Connection connection = null;
        try{

            connection= BD.getConnection();
            logger.info("Connexión exitosa");

            PreparedStatement ps_Insert = connection.prepareStatement(SQL_INSERT);
            ps_Insert.setInt(1,odontologo.getId());
            ps_Insert.setString(2,odontologo.getNombre());
            ps_Insert.setString(3,odontologo.getApellido());
            ps_Insert.setString(4,odontologo.getMatricula());
            ps_Insert.execute();
            logger.info("El usuario con matricula "+ odontologo.getMatricula() + ",fue guardado exitosamente");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        return odontologo;
    }

    @Override
    public List<Odontologo> listar() {
        Connection connection = null;
        List<Odontologo> odontologos = new ArrayList<>();
        Odontologo odontologo = null;

        try{
            connection= BD.getConnection();
            logger.info("Connexión exitosa");
            PreparedStatement psSelectAll= connection.prepareStatement(SQL_SELECT_ALL);
            ResultSet rs= psSelectAll.executeQuery();
            while (rs.next()){
                odontologo = new Odontologo(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4));
                odontologos.add(odontologo);
                logger.info("Los odontologos fueron listados correctamente");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        return odontologos;
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
}
