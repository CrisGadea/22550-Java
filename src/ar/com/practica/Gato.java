package ar.com.practica;

public class Gato extends Animal{

	public Gato() {}
	
	public Gato(String color, String tipo, Double tamanio, int edad, int cantidadDePatas) {
		super(color, tipo, tamanio, edad, cantidadDePatas);
	}
	
	@Override
	public String emitirSonido() {
		return "MIAU";
	}
}
