package laboratorioFinal;

import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		
		Persona[] personas;
		int cantPersonas;
		Scanner teclado = new Scanner(System.in);


		System.out.println("Ingreso de Datos de Personas Laboratorio Final");
		System.out.print("\n");


		System.out.print("Ingrese la cantidad de Personas que cargara: ");
		cantPersonas = teclado.nextInt();
		
		personas = new Persona[cantPersonas];


		for (int i = 0; i < personas.length; i++) {

			Persona personaAuxiliar = new Persona();
			Documento documento = new Documento();

			System.out.print("Ingrese el Nombre de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.setNombre(teclado.next());
			System.out.print("Ingrese el Apellido de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.setApellido(teclado.next());
			System.out.print("Ingrese el Tipo de Documento de la Persona [" + (i + 1) + "]: ");
			documento.setTipoDocumento(teclado.next());
			System.out.print("Ingrese el Numero de Documento de la Persona [" + (i + 1) + "]: ");
			documento.setNumeroDocumento(teclado.nextInt());

			// seteamos el dato del documento en la persona
			personaAuxiliar.setDocumento(documento);
			System.out.print("Ingrese la Edad de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.setEdad(teclado.nextByte());

			personas[i] = personaAuxiliar;
			System.out.println();

		}
		System.out.print("\n");

		System.out.println("Datos de las Personas");
		for (int i = 0; i < personas.length; i++) {

			String atributosPersona = "Nombre: " + personas[i].getNombre() + ", Apellido: " + personas[i].getApellido()
					+ ", Tipo de Documento: " + personas[i].getDocumento().getTipoDocumento() + ", Numero de Documento: "
					+ personas[i].getDocumento().getNumeroDocumento() + ", Edad: " + personas[i].getEdad() + " y es "
					+ (personas[i].mayorEdad() ? "mayor de edad" : "menor de edad");
			System.out.println(atributosPersona);

		}


		teclado.close();
	}

}
