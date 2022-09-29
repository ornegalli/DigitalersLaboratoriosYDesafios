package Módulo19;

import java.util.Scanner;

public class laboratorio02ej3 {

	public static void main(String[] args) {

		float numero1 = 710f;
		float numero2 = 433f;
		Scanner teclado = new Scanner(System.in);

		
		System.out.println("Operaciones matematicas basicas");
		System.out.print("\n");

		
		System.out.println("El valor de la variable numero 1 es: " + numero1);
		System.out.println("El valor de la variable numero 2 es: " + numero2);
		System.out.print("\n");
		System.out.println("Ingrese la operacion que desea realizar. (s (suma),r (resta) ,m (multiplicacion),d (division))");
		String operacion = teclado.nextLine();

		switch(operacion){
		
		case "s" : System.out.println("Resultado: " + (numero1 + numero2));break;
		case "r" : System.out.println("Resultado: " + (numero1 - numero2));break;
		case "m" : System.out.println("Resultado: " + (numero1 * numero2));break;
		case "d" : System.out.println("Resultado: " + (numero1 / numero2));break;
		
		}
		
		
		teclado.close();

	}

}
