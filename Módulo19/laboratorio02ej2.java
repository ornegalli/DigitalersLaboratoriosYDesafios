package Módulo19;

import java.util.Scanner;

public class laboratorio02ej2 {

		public static void main(String[] args) {
			

			float numero1 = 5.0f;
			float numero2 = 6.3f;
			float total= 0.0f;
			Scanner teclado = new Scanner(System.in);

			
			System.out.println("Operaciones matematicas basicas");
			System.out.print("\n");

			
			System.out.println("El valor de la variable numero 1 es: " + numero1);
			System.out.println("El valor de la variable numero 2 es: " + numero2);
			System.out.print("\n");
			System.out.println("Ingrese la operacion que desea realizar. (+, - , *, /)");
			String operacion = teclado.nextLine();

			if (operacion ==  "+") {
				total = numero1 + numero2;
			} else if (operacion == "-") {
				total = numero1 - numero2;
			} else if (operacion == "*") { 
				total = numero1 * numero2;
			} else if (operacion == "/") {
				total = numero1 / numero2;
			} else {
				System.out.println("Indico una operacion no valida");
			}

			System.out.println("El resultado de (" + numero1 + " " + operacion + " " + numero2 + ") es: " + total);
			
			teclado.close();
		}
	

	}


