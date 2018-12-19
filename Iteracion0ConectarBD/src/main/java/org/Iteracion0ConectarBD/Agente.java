package org.Iteracion0ConectarBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author astraOS
 *
 */
public class Agente {

    /**
     * @param conexion
     *
     */
    private Connection conexion;
    /**
     * @param sentencia
     */
    private Statement sentencia;

    /**
     * Constructor de la clase.
     *
     */
    public Agente() {

    }

    /**
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public final boolean conectar()
            throws SQLException, ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.
                    getConnection("jdbc:sqlite:src/bd.db");
            if (conexion == null) {
               System.out.println("Conexión nula. "
            + "Algo ha fallado");
            } else {
               System.out.println("Conexión realizada "
            + "con éxito!");
            }
        } catch (SQLException e) {
            System.out.println("Ha fallado la conexión");
            return false;
        }
        try {
            this.sentencia = this.conexion.createStatement();
        } catch (SQLException e) {
            System.out.println("Ha fallado la conexión");
            return false;
        }
        return true;
    }

    /**
     * Metodo consultar.
     * @return ResultSet
     * @throws SQLException
     * @param sql
     */
    public final ResultSet consultar(final String sql) throws SQLException {
        ResultSet rs;
        rs = this.sentencia.executeQuery(sql);
        return rs;
    }

    /**
     * Metodo cerrarConexion.
     */
    public final void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
