package laboratorio01;

public class Persona {
	String nombre;
	String apellido;
	String tipoDocumento;
	int numeroDocumento;
	byte edad;
	
	void mostrarAtributos() {
		
		System.out.println("Nombre: " + nombre + "\n" + "Apellido: " +
							apellido + "\n" + "Tipo de Documento: " + tipoDocumento + "\n" +
							"Numero de documento: " + numeroDocumento + "\n" + "Edad: " + edad);
	}

}
