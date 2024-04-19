package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {
	
	// ESTA CLASE VA A SER LA UNICA PARA ESTABLECER CONEXIONES CON LAS BBDD -> POR ESO VA SER STATICO
	
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/sakila";
	private static final String USUARIO = "root";
	private static final String PASSWORD = "AlumnoIFP";
	
	public static Connection open() throws SQLException{ // EN VEZ DE EL TRY/CATH, LO QUE HACE ES PASAR EL TRY/CATH AL QUE USE EL OPEN
		Properties props = new Properties(); // ESTE OBJTO RECIBE LOS VALORES PREVIAMENTE DEFINIDOS
		props.setProperty("user", USUARIO);
		props.setProperty("password", PASSWORD);
		/*props.setProperty("ssl", "true");*/ // PARA REALIZAR UNA CONEXION SEGURA 
		
		// GET CONNECTION DEVUELVE UN OBJETO CONNECTION, NOS PERMITE ESTABLECER CONEXION Y HACER CONSULTAS.
		
		return DriverManager.getConnection(URL, props);
	}
}
