package ar.com.practica;

public class Animal {

	// Características: Propiedades (Variables o Constantes)
	private String color, tipo;
	private Double tamanio;
	private int edad, cantidadDePatas;
	private String nombre;
	
	//Método Constructor: Nos sirve para poder crear objetos de la clase
	// Metodo constructor vacio (por default)
	public Animal() {
		
	}
	
	public Animal(String color, String tipo, Double tamanio, int edad, int cantidadDePatas) {
		this.color = color;
		this.tipo = tipo;
		this.tamanio = tamanio;
		this.edad = edad;
		this.cantidadDePatas = cantidadDePatas;
	}
	
	// Comportamientos: Métodos (Funciones)
	
	// Métodos Getters y Setters
	// Getters: Me permiten obtener el valor de una propiedad del objeto
	// Setters: Me permiten setear/modificar el valor de una prop.
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getTamanio() {
		return tamanio;
	}

	public void setTamanio(Double tamanio) {
		this.tamanio = tamanio;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCantidadDePatas() {
		return cantidadDePatas;
	}

	public void setCantidadDePatas(int cantidadDePatas) {
		this.cantidadDePatas = cantidadDePatas;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void comer() {
		
	}
	
	public void moverse() {
		
	}
	
	public void dormir() {
			
	}
	
	public void respirar() {
		
	}
	
	public String emitirSonido() {
		return "Emitiendo sonido...";
	}
}
