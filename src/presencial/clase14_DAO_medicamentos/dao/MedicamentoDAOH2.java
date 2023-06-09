package presencial.clase14_DAO_medicamentos.dao;

import org.apache.log4j.Logger;
import presencial.clase14_DAO_medicamentos.model.Medicamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MedicamentoDAOH2 implements iDao<Medicamento>{
    private static final String SQL_INSERT="INSERT INTO MEDICAMENTOS VALUE(?,?,?,?,?,?)";
    //El log4j permite tener una bitacora de nuestro codigo
    private static final Logger LOGGER = Logger.getLogger(MedicamentoDAOH2.class);

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        //Acá cargamos, ejecutamos y gaurdamos el preparedStatement
        LOGGER.info("Inicio del guardado de un medicamento");
        Connection connection = null;
        try {
            //Conectarme a la bd
            connection = bd.getConnection();
            PreparedStatement ps_insert = connection.prepareStatement(SQL_INSERT);
            ps_insert.setInt(1,medicamento.getId());
            ps_insert.setInt(2,medicamento.getCodigo());
            ps_insert.setString(3,medicamento.getNombre());
            ps_insert.setString(4,medicamento.getLaboratorio());
            ps_insert.setInt(5,medicamento.getCantidad());
            ps_insert.setDouble(6,medicamento.getPrecio());

        }catch (Exception e){
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                }catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        return medicamento;
    }
}
