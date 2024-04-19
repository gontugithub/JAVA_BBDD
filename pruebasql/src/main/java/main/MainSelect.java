package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;
import entidades.Actor;

public class MainSelect {

	public static void main(String[] args) {
		
		ArrayList<Actor> actores = new ArrayList();
		
		// PARA UNA CONSULTA SELECT 
		
		try (Connection connection = Conexion.open()){
			
			String query = "SELECT * FROM actor WHERE first_name LIKE 'E%'";
			
			try (PreparedStatement ps = connection.prepareStatement(query)){
				
				try(ResultSet rs = ps.executeQuery()){
					
					// RESULTSET NOS DEJA LEER EN ORDEN PERO NO DEJA VOLVER PARA ATRAS
					// .next NOS DEVUELVE UN TRUE O FALSE (CUANDO NO HAY NADA MSA QUE LEER)
					
					while (rs.next()) { // BUCLE PARA VER LA TABLA 
						int id = rs.getInt("actor_id"); // rs.getInt(1) ESTO SERIA LA EQUIVALENCIA
						String nombre = rs.getString("first_name");
						String apellido = rs.getString("last_name");
						String ultimaActualizacion = rs.getString("last_update");
						
						Actor newActor = new Actor(id, nombre, apellido, ultimaActualizacion);
						
						actores.add(newActor);
						
						System.out.println(newActor);
						
						
						
					}
					
				}
				
			}
			
		} catch (SQLException e) {
			
		}
		
		
		

	}

}
