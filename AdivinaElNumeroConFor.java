package arrays;

import java.util.Scanner;

//PRACTICA REALIZADA POR WILFREDO PINO https://github.com/wilfredopinom

//GENERA UN PROGRAMA  QUE PERMITA ADIVINAR UN NUMERO, TENIENDO SOLO 10 OPORTUNIDADES PARA ADIVINAR.
//GENERA EL NUMERO ALEATORIO 
//PERMITE QUE EL NUMERO ALEATORIO SE MUESTRE Y EJECUTA
//EJECUTA SIN QUE SE MUESTRE EL NUMERO ALEATORIO. 


public class AdivinaElNumeroConFor {


		public static void main (String[]args) {
			
			Scanner teclado = new Scanner (System.in);
			
			int aleatorio = (int)(1+ Math.random()*101);
		//System.out.println("EL NUMERO OBJETIVO ES: " + aleatorio); CONTRALA LA VISIBILIDAD DEL NUMERO OBJETIVO
		
			int numero;
			int intentos = 10;
			boolean acertado = false;
			System.out.println("BIENVENIDO AL JUEGO, SOLO TIENES 10 INTENTOS.");
			for (int i=intentos ; i > 0 ;i--) {
				System.out.println("");
			System.out.println("INTENTO NUMERO " + (1 +(10-i)));
		
			System.out.print("Ingrese el numero OBJETIVO:");
		
			numero= teclado.nextInt();
			
			if ( numero == aleatorio) {
				acertado=true;
				System.out.println("Enhorabuena, has acertado");
				i=0;
			}
			else {
				if (numero < aleatorio) {
			System.out.println("El numero Objetivo es Mayor");
			
		}  else {
			System.out.println("El número Objetivo es menor ");

		}
			}
			}
		if(!acertado) {
		System.out.println("LO SIENTO, AGOTASTE LOS INTENTOS");

	}
}}



