package presencial.clase13_consultaBD_cuenta;

import java.sql.*;

public class Cliente {
    private static final String SQL_DROP_CREATE="DROP TABLE IF EXISTS CUENTAS;" +
            "CREATE TABLE CUENTAS(ID INT PRIMARY KEY, NRO_CUENTA INT NOT NULL,NOMBRE VARCHAR(100) NOT NULL," +
            "SALDO NUMERIC(10,2) NOT NULL)";
    private static final String SQL_INSERT="INSERT INTO CUENTAS VALUES(?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE CUENTAS SET SALDO=? WHERE ID=?";
    private static final String SQL_SELECT="SELECT * FROM CUENTAS";
    public static void main(String[] args) {
        Connection connection= null;
        try {
            //Aca nos conectamos a la bdd después de haber creado las consultas
            connection= getConnection();
            //Se crea la tabla
            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_CREATE);
            //Se insertan los datos con prepareStatement que permite ejecutar consultas de SQL parametrizadas
            PreparedStatement ps_Insert = connection.prepareStatement(SQL_INSERT);
            ps_Insert.setInt(1,1);
            ps_Insert.setInt(2,123456);
            ps_Insert.setString(3,"Nataly Sarmiento");
            ps_Insert.setDouble(4,100);
            ps_Insert.execute();

            //Actualizar +10 al saldo, fijarse del orden de los '?' en las consultas
            PreparedStatement ps_Update = connection.prepareStatement(SQL_UPDATE);
            ps_Update.setDouble(1, 300 + 10);
            ps_Update.setInt(2,1);
            ps_Update.execute();

            //Aca volvería el rollBack
            //Generamos una 'pausa' para hacer la excepeción desactivando los commit para que los cambios no se vean reflejados
            connection.setAutoCommit(false);

            //Se vuelve a actualizar el valor del saldo
            PreparedStatement ps_tx = connection.prepareStatement(SQL_UPDATE);
            ps_tx.setDouble(1,300+10+15);
            ps_tx.setInt(2,1);
            ps_tx.execute();

            //Confirmo el úlitmo cambio en la bdd
            connection.commit();

            //SetAcutoCommit vuelve a True como buena practica
            connection.setAutoCommit(true);


        }catch (Exception e){
            e.printStackTrace();
            try {
                connection.rollback();
            }catch (SQLException sql){
                sql.printStackTrace();
            }
        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/clase13","sa","sa");
    }
}
