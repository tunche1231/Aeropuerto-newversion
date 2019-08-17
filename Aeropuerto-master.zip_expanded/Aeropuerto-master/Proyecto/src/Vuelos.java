import java.util.ArrayList;
import java.util.List;

public class Vuelos {
	
	private String hora;
	private Aviones avion;
	private Pilotos piloto;
	List<Pasajeros> pasajeros;

	
	public Vuelos(String hora, Aviones avion, Pilotos piloto) {
		this.hora = hora;
		this.avion = avion;
		this.piloto = piloto;
		pasajeros = new ArrayList<Pasajeros>();
		
	}

	public Vuelos() {
		pasajeros = new ArrayList<Pasajeros>();
		this.avion = new Aviones();
		this.piloto = new Pilotos();
		this.hora = "2:30 pm";
		Pasajeros pasajero1 = new Pasajeros("Carlos","70415484", 35,"Masculino","Pasajero");
		Pasajeros pasajero2 = new Pasajeros("Miguel","41715441", 15,"Masculino","Pasajero");
		Pasajeros pasajero3 = new Pasajeros("Josefina","71458621", 23,"Femenino","Pasajera");
		pasajeros.add(pasajero1);
		pasajeros.add(pasajero2);
		pasajeros.add(pasajero3);
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Aviones getAvion() {
		return avion;
	}

	public void setAvion(Aviones avion) {
		this.avion = avion;
	}

	public Pilotos getPiloto() {
		return piloto;
	}

	public void setPiloto(Pilotos piloto) {
		this.piloto = piloto;
	}

	public List<Pasajeros> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List<Pasajeros> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public void imprimir() {
		System.out.println("========Vuelo========\n");
		System.out.println("Hora de salida :  "+hora);
		avion.imprimir();
		piloto.imprimir();
		for (Pasajeros pasaj : pasajeros) {
			pasaj.imprimir();
		}
	}
}












