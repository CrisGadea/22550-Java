package ar.com.practica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*String nombre = "Juana";
		String saludo = "Hola ";
		// Las constantes en Java se crean con la palabra "final"
		final int ANIO = 2022;
		*/
		//System.out.println(saludo + nombre);
		//System.out.println("Estamos en el año " + ANIO);
		
		
		// La Clase Scanner nos permite interactuar con el usuario desde la terminal
		Scanner sc = new Scanner(System.in); // El System.in nos permite obtener entradas
		/*
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt(); // nextInt nos permite almacenar un valor entero que haya dado el usuario mediante la terminal
		System.out.println("Su edad es " + edad);
		*/
		
		/*
		System.out.println("Ingrese un numero");
		int numero1 = sc.nextInt();
		System.out.println("Ingrese otro numero");
		int numero2 = sc.nextInt();
		
		System.out.println("Elija la operación a realizar");
		System.out.println("");
		System.out.println("######### MENU ##########");
		System.out.println("1) SUMAR");
		System.out.println("2) RESTAR");
		System.out.println("3) MULTIPLICAR");
		System.out.println("4) DIVIDIR");
		System.out.println("#########################");
		
		int operacion = sc.nextInt();
		
		int resultado = 0;
		
		switch (operacion) {
		case 1: 
			resultado = numero1 + numero2;
			break;
		case 2: 
			resultado = numero1 - numero2;
			break;
		case 3: 
			resultado = numero1 * numero2;
			break;
		case 4: 
			resultado = numero1 / numero2;
			break;
		default:
			System.out.println("Ingrese una opcion correcta");
			break;
		}
		
		// En base a la opcion elegida del usuario, debemos imprimir por consola el resultado de la operación elegida
		System.out.println("El resultado de la operación es: " + resultado);
		*/
		
		Animal animal1 = new Animal();
		animal1.setColor("Blanco");
		Animal animal2 = new Animal("Negro", "Gato", 0.57, 1, 4);
		
		Perro perro1 = new Perro();
		perro1.setNombre("Firulais");
		
		Gato gato1 = new Gato();
		gato1.setTipo("Gato Callejero");
		Pantera pantera = new Pantera();
		pantera.setNombre("Cleo");
		pantera.setPuedeCazar(true);
		pantera.cazar(gato1);
		
		// EJECUTAMOS EL EMITIR SONIDO DE CADA ANIMAL
		System.out.println(pantera.emitirSonido());
		System.out.println(gato1.emitirSonido());
		System.out.println(perro1.emitirSonido());
		System.out.println(animal1.emitirSonido());
		
		
		

		System.out.println("El animal 1 es de color " + animal1.getColor());
		System.out.println("El animal 2 es de color " + animal2.getColor());
		System.out.println("El perro se llama: " + perro1.getNombre());

	}

}
