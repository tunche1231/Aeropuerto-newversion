
public class Pasajeros extends Personas {
	
	private String pasajero;

	public Pasajeros(String persona, String dni, int edad, String sexo, String pasajero) {
		super(persona, dni, edad, sexo);
		this.pasajero = "pasajero";
	}
	
	public Pasajeros() {
		pasajero = "Pasajero";
	}

	public String getPasajero() {
		return pasajero;
	}

	public void setPasajero(String pasajero) {
		this.pasajero = pasajero;
	}
	
	public void imprimir() {
		System.out.println("\n========Pasajero========");
		System.out.println("\n1.NOMBRE     :  "+getNombre());
		System.out.println("2.DNI        :  "+getDni());
		System.out.println("3.EDAD       :  "+getEdad());
		System.out.println("4.SEXO       :  "+getSexo());
		System.out.println("5.CARGO      :  "+getPasajero()+"\n");
		System.out.println("--------------------------");
	}
}
