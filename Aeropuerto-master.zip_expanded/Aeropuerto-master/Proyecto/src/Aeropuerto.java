import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
	
	private String nombre;
	private String ciudad;
	Aviones avion_1 = new Aviones("Lima","Arequipa");
	Aviones avion_2 = new Aviones("Cusco","Arequipa");
	Aviones avion_3 = new Aviones("Arequipa","lima");
	Pilotos piloto_1 = new Pilotos("Diego","25457841",32,"Masculino","piloto");
	Pilotos piloto_2 = new Pilotos("Maria","45747841",46,"Femenino","pilota");
	Pilotos piloto_3 = new Pilotos("Carol","74457841",29,"Femenino","pilota");
	
	List<Vuelos> vuelos;
	
	public Aeropuerto(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		vuelos = new ArrayList<Vuelos>();
	}
	
	public Aeropuerto() {
		vuelos = new ArrayList<Vuelos>();
		this.nombre = "Aeropuerto Tunque";
		this.ciudad = "Arequipa";
		Vuelos vuelo1 = new Vuelos("2:00",avion_1,piloto_1);
		vuelo1.getPasajeros().add(new Pasajeros("Ana", "45318245", 17, "F", "Pasajera"));
		vuelo1.getPasajeros().add(new Pasajeros("Claudia", "80318245", 28, "F", "Pasajera"));
		Vuelos vuelo2 = new Vuelos("3:30",avion_2,piloto_2);
		vuelo2.getPasajeros().add(new Pasajeros("Marko", "70318245", 23, "M", "Pasajero"));
		vuelo2.getPasajeros().add(new Pasajeros("Marco", "65457145", 28, "M", "Pasajero"));
		vuelo2.getPasajeros().add(new Pasajeros("Patrick", "71458546", 32, "F", "Pasajera"));
		Vuelos vuelo3 = new Vuelos("6:40",avion_3,piloto_3);
		vuelo3.getPasajeros().add(new Pasajeros("Duber", "14518245", 30, "M", "Pasajero"));
		vuelos.add(vuelo1);
		vuelos.add(vuelo2);
		vuelos.add(vuelo3);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void imprimir() {
		System.out.println("========Aeropuerto========\n");
		System.out.println(nombre);
		System.out.println("Ciudad: "+ciudad);
		System.out.println("\n--------------------------\n");
		for (Vuelos vuel : vuelos) {
			vuel.imprimir();
		}
	}
}















