package Módulo19;

import java.util.Scanner;
import java.util.Arrays;

public class desafio {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int[] numerosAleatorios;
		int cantidadNumeros;

		System.out.println("Indique la cantidad de numeros aleatorios a generar: ");
		cantidadNumeros = teclado.nextInt();

		numerosAleatorios = new int[cantidadNumeros];

		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			
			numerosAleatorios[i] = (int) ((Math.random() * cantidadNumeros) + 1);

		}

	
		System.out.println(Arrays.toString(numerosAleatorios));


		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = numerosAleatorios[i];
			boolean divisible3 = numero % 3 == 0;
			boolean divisible5 = numero % 5 == 0;
			String resultado = "";

			if (divisible3) {
				resultado += "Fizz";
			}

			if (divisible5) {
				resultado += "Buzz";
			}

			System.out.println(resultado.length() > 0 ? resultado : numero);

		}

		teclado.close();
	}

}
