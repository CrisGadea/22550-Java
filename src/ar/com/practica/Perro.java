package ar.com.practica;

public class Perro extends Animal {
	
	private Boolean tieneDuenio;

	public Perro() {
		// TODO Auto-generated constructor stub
	}

	public Perro(String color, String tipo, Double tamanio, int edad, int cantidadDePatas) {
		super(color, tipo, tamanio, edad, cantidadDePatas);
		// TODO Auto-generated constructor stub
	}

	public Boolean getTieneDuenio() {
		return tieneDuenio;
	}

	public void setTieneDuenio(Boolean tieneDuenio) {
		this.tieneDuenio = tieneDuenio;
	}
	
	@Override
	public String emitirSonido() {
		return "GUAU";
	}
	
}
