
public abstract class Personas {
	private String nombre;
	private String dni;
	private int edad;
	private String sexo;
	
	public Personas(String nombre, String dni, int edad, String sexo) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Personas() {
		this.nombre = "Saul Rivas";
		this.dni = "45714586";
		this.edad = 23;
		this.sexo = "Masculino";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String persona) {
		this.nombre = persona;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public abstract void imprimir();
	
}
