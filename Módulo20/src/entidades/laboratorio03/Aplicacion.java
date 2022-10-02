package entidades.laboratorio03;

import java.util.Scanner;


public class Aplicacion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Persona[] personas;
		int cantPersonas;

		System.out.println("Ingreso de Datos de Personas");

		System.out.print("\n");

	
		System.out.print("Ingrese la cantidad de Personas que cargara: ");

		cantPersonas = teclado.nextInt();
		personas = new Persona[cantPersonas];


		for (int i = 0; i < personas.length; i++) {
			System.out.print("Ingrese el Nombre de la Persona [" + (i + 1) + "]: ");
			String nombre = teclado.next();
			System.out.print("Ingrese el Apellido de la Persona [" + (i + 1) + "]: ");
			String apellido = teclado.next();
			System.out.print("Ingrese el Tipo de Documento de la Persona [" + (i + 1) + "]: ");
			String tipoDocumento = teclado.next();
			System.out.print("Ingrese el Numero de Documento de la Persona [" + (i + 1) + "]: ");
			int numeroDocumento = teclado.nextInt();

			Documento documento = new Documento(tipoDocumento, numeroDocumento);
		
			Persona personaAuxiliar = new Persona(nombre, apellido, documento);

			personas[i] = personaAuxiliar;
			System.out.println();

		}

		System.out.println("Datos de las Personas");
		for (int i = 0; i < personas.length; i++) {

			System.out.println(personas[i].mostrarAtributos());

			System.out.println("\n");

		}
		
		teclado.close();

	}

}
