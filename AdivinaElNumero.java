package arrays;

import java.util.Scanner;

//PRACTICA REALIZADA POR WILFREDO PINO https://github.com/wilfredopinom

// GENERA UN PROGRAMA QUE PERMITA ADIVINAR UN NUMERO, TENIENDO SOLO 10 OPORTUNIDADES PARA ADIVINAR.
// GENERA EL NUMERO ALEATORIO 
//PERMITE QUE EL NUMERO ALEATORIO SE MUESTRE Y EJECUTA
// EJECUTA SIN QUE SE MUESTRE EL NUMERO ALEATORIO. 

public class AdivinaElNumero {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); //

		// GENERAMOS NUMEROS ALEATORIOS ENTRE 1 Y 100

		int aleatorio = (int) (0 + Math.random() * 101);
		//System.out.println(" El número generado es " + aleatorio); // PUEDES ELAGIR MOSTRAR O NO MOSTRAR EL ALEATORIO

		int numero;
		int intentos = 10;
		boolean acertado = false;
		System.out.println("BIENVENIDO AL JUEGO");
		System.out.println("");
		do {
			
			System.out.println("INTENTO NÚMERO " + (1+(10- intentos)));
		
		System.out.println ("Introduzca el número OBJETIVO:");
		numero = teclado.nextInt();
		
		if (numero == aleatorio) 
		{
			acertado=true;
		System.out.println("Enhorabuena, has acertado el número OBJETIVO");
		}
		else {
		if	(numero>aleatorio) {
			System.out.println("El número  OBJETIVO es menor");
		}else {
			
		System.out.println("El número OBJETIVO es mayor");
		} intentos--;
		}}
		while (intentos >0 && !acertado);
		
		if (!acertado) { System.out.println("LO SIENTO AGOTASTE LOS INTENTOS");
		
		
		}
		
	}
}



