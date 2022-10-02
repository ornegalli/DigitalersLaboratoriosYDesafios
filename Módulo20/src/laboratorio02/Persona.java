package laboratorio02;

public class Persona {
	String nombre;
	String apellido;
	Documento documento;
	byte edad;
	
	Persona (String nombre, String apellido, Documento documento, byte edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = edad;
	}


	boolean mayorEdad() {

		return edad >= 18;
	}
	
	void mostrarAtributos() {
		
		System.out.println("Nombre: " + nombre + "\n" + "Apellido: " +
							apellido + "\n" + documento.mostrarAtributos() + "\n" + "Edad: " + edad +  " y es " + (mayorEdad() ? "mayor de edad" : "menor de edad"));
	}
}
