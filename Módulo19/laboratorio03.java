package Módulo19;


import java.util.Random;
import java.util.Scanner;

public class laboratorio03 {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		Scanner teclado = new Scanner(System.in);
		int numeroAleatorio = aleatorio.nextInt(10) + 1;
		int numeroIngresado = 1;
		

		do {
			
			System.out.println("Adivina el numero del 1 al 10");
			numeroIngresado = teclado.nextInt();
			
			if (numeroIngresado == numeroAleatorio) {
				System.out.println("¡Adivinaste!");
			}else if (numeroIngresado < numeroAleatorio) {
				System.out.println("Ingrese un numero mayor");
			}else {
				System.out.println("Ingrese un numero menor");
			}
			
		}while(numeroIngresado != numeroAleatorio);
	
		teclado.close();
	}


}
