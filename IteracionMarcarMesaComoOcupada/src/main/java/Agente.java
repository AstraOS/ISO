
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Agente {

	private Connection conexion;
	private Statement sentencia;
	
	public Agente() {
		
	}

	public boolean conectar() throws SQLException, ClassNotFoundException {
		try {
			Class.forName("org.sqlite.JDBC");
			conexion = DriverManager.getConnection("jdbc:sqlite:src/main/resources/bd.db");
			if(conexion==null) {
				System.out.println("Conexión nula. Algo ha fallado");
			} else {
				System.out.println("Conexión realizada con éxito!");
			}
		} catch (SQLException e) {
			System.out.println("Ha fallado la conexión");
			return false;
		}
		try {
			this.sentencia = this.conexion.createStatement();
		}

		catch (SQLException e) {
			System.out.println("Ha fallado la conexión");
			return false;
		}
		return true;
	}

	public ResultSet Consultar(String sql) throws SQLException {
		ResultSet rs;
		rs = this.sentencia.executeQuery(sql);
		return rs;
	}

	public void Modificar(String sql) throws SQLException {

		this.sentencia.executeUpdate(sql);

	}

	public void cerrarConexion() {
		try {
			conexion.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
