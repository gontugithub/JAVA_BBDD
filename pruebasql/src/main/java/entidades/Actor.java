package entidades;

public class Actor {
	
	private int id;
	private String nombre;
	private String apellido;
	private String ultimaActualizacion;
	
	public Actor(int id, String nombre, String apellido, String ultimaActualizacion) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ultimaActualizacion = ultimaActualizacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUltimaActualizacion() {
		return ultimaActualizacion;
	}

	public void setUltimaActualizacion(String ultimaActualizacion) {
		this.ultimaActualizacion = ultimaActualizacion;
	}

	@Override
	public String toString() {
		return "Actor [" + id + ", " + nombre + ", " + apellido + ", "
				+ ultimaActualizacion + "]";
	}
	

	
	
}
