
public class Aviones {
	
	private String salida;
	private String destino;
	
	public Aviones(String salida, String destino) {
		this.salida = salida;
		this.destino = destino;
	}
	
	public Aviones() {
		this.salida = "Arequipa";
		this.destino = "Lima";
	}
	
	public String getSalida() {
		return salida;
	}
	public void setSalida(String salida) {
		this.salida = salida;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public void imprimir() {
		System.out.println("Salida         :  "+salida);
		System.out.println("Destino        :  "+destino);
		System.out.println("\n--------------------------");
	}
}
