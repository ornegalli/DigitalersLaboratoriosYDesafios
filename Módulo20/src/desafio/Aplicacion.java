package desafio;

import java.util.Scanner;
import java.util.Arrays;

public class Aplicacion {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Usuario usuario = new Usuario();
		String[] simbolos = { "*", ".", "-", "_" };
		String dominioValido = "@educacionit.com";
		String correo;
		String clave;
		
		System.out.print("Indique su correo electronico: ");
		correo = teclado.next().toLowerCase();
		
		if (correo.length() > dominioValido.length() && correo.endsWith(dominioValido)) {
			System.out.println("Debe ser un correo valido y recuerde que el dominio debe se de " + dominioValido);
		};

		System.out.print("Indique su correo electronico: ");
		correo = teclado.next().toLowerCase();
		
		System.out.print("Indique su clave: ");
		clave = teclado.next();

		String primeraLetra = clave.substring(0, 1);
		boolean iniciaMayuscula = primeraLetra.toUpperCase().equals(primeraLetra);
		boolean contieneSimbolo = false;

		for (int i = 0; i < simbolos.length; i++) {
			
			if (clave.contains(simbolos[i])) {
				contieneSimbolo = true;
				break;
			}
		}

		if (!iniciaMayuscula || !contieneSimbolo) {
			System.out.println(
					"Recuerde que la clave debe empezar en mayuscula y debe contener al menos uno de los siguientes simbolos: "
							+ Arrays.toString(simbolos));
			System.out.print("Indique su clave: ");
			clave = teclado.next();
		}
	
	usuario.setCorreo(correo);
	usuario.setClave(clave);
	System.out.println(usuario.getDatos());

	teclado.close();
	
	
	}

}
