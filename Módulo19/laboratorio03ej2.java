package Módulo19;

import java.util.Scanner;

public class laboratorio03ej2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numeroMaximoIntentos = 3;
		boolean credencialescorrectas = false;

		System.out.println("Ingreso al Sistema");


		for (int i = 0; (!credencialescorrectas && i < numeroMaximoIntentos); i++) {
			System.out.print("Introduzca su usuario: ");
			String usuario = teclado.next();
			System.out.print("Introduzca su clave: ");
			String clave = teclado.next();

			
			if (usuario.equalsIgnoreCase("Usuario") && clave.equals("clave1234")) {
				credencialescorrectas = true;
			} else {
				System.out.println("Credenciales incorrectas, Intente de nuevo ");
			}

		}

		if (credencialescorrectas) {
			System.out.println("¡Bienvenido!");
		} else {
			System.out.println("Usuario Bloqueado");
		}


		teclado.close();


	}

}
