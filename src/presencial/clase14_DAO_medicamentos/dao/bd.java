package presencial.clase14_DAO_medicamentos.dao;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//3
public class bd {
    private static final String SQL_DROP_CREATE="DROP TABLE IF EXISTS MEDICAMENTOS; " +
            "CREATE TABLE MEDICAMENTOS(ID INT PRIMARY KEY, CODIGO INT NOT NULL, NOMBRE VARCHAR(100) NOT NULL," +
            " LABORATORIO VARCHAR(100) NOT NULL, CANTIDAD INT NOT NULL, PRECIO NUMERIC(10,2))";
    //Las consultas de insert se agregan en el DAO

    private static final Logger LOGGER = Logger.getLogger(bd.class);
    public static void crearTabla(){
        Connection connection = null;
        try{
            connection= getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_CREATE);
            LOGGER.info("Se ha creado con exito la tabla");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }

    }
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/clase14","sa","sa");
    }
}
