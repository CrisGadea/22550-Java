package ar.com.practica;

public class Pantera extends Animal {
	
	private Boolean puedeCazar;

	public Pantera() {
		// TODO Auto-generated constructor stub
	}

	public Pantera(String color, String tipo, Double tamanio, int edad, int cantidadDePatas) {
		super(color, tipo, tamanio, edad, cantidadDePatas);
		// TODO Auto-generated constructor stub
	}

	public Boolean getPuedeCazar() {
		return puedeCazar;
	}

	public void setPuedeCazar(Boolean puedeCazar) {
		this.puedeCazar = puedeCazar;
	}
	
	public void cazar(Animal animal) {
		if (puedeCazar) {
			System.out.println("El animal " + this.getNombre() + " cazó a " + animal.getTipo());
		}
	}
	
	@Override
	public String emitirSonido() {
		return "ROOOARR";
	}

}
