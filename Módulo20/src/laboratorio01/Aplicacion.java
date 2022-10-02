package laboratorio01;

import java.util.Scanner;


public class Aplicacion {

	public static void main(String[] args) {
			
		Persona [] personas;
		int cantPersonas;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingreso de Datos de Personas");
		System.out.println("");
		
		System.out.println("Ingrese la cantidad de personas que desea cargar");
		cantPersonas = teclado.nextInt();
		
		personas = new Persona[cantPersonas];
		
		// usamos un for para preguntar cada uno de los datos de las personas
		for(int i = 0; i < cantPersonas; i++) {
			
			// preguntamos los datos de las personas y podemos usar un objeto auxiliar
			Persona personaAuxiliar = new Persona();
			System.out.println("Ingrese el Nombre de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.nombre = teclado.next();
			
			System.out.println("Ingrese el Apellido de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.apellido = teclado.next();
			
			System.out.println("Ingrese el Tipo de Documento de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.tipoDocumento = teclado.next();
			
			System.out.println("Ingrese el Numero de Documento de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.numeroDocumento = teclado.nextInt();
			
			System.out.println("Ingrese la Edad de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.edad = teclado.nextByte();
			
			personas[i] = personaAuxiliar;
		}
		
		System.out.println("Datos de las Personas");
		System.out.println("\n");

		
		for (int i = 0; i < personas.length; i++) {

			personas[i].mostrarAtributos();
			System.out.println(personas[i].edad >= 18 ? "Es mayor de edad" : "Es menor de edad");
			System.out.println("\n");

		}
		
		teclado.close();
	}

}
