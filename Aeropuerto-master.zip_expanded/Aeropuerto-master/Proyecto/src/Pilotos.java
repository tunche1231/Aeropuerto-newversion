
public class Pilotos extends Personas{
	
	private String piloto;

	public Pilotos(String persona, String dni, int edad, String sexo, String piloto) {
		super(persona, dni, edad, sexo);
		this.piloto = "piloto";
	}
	
	public Pilotos() {
		piloto = "Piloto";
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	
	public void imprimir() {
		System.out.println("\n========Piloto========");
		System.out.println("\n1.NOMBRE    :  "+getNombre());
		System.out.println("2.DNI       :  "+getDni());
		System.out.println("3.EDAD      :  "+getEdad());
		System.out.println("4.SEXO      :  "+getSexo());
		System.out.println("5.CARGO     :  "+getPiloto()+"\n");
		System.out.println("--------------------------");
	}
}
