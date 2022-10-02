package entidades.laboratorio03;

import java.util.Random;


public class Persona {
	public String nombre;
	public String apellido;
	public Documento documento;
	private byte edad;

	public Persona(String nombre, String apellido, Documento documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = asignarEdad();
	}

	public boolean mayorEdad() {
		return edad >= 18;
	}



	public String mostrarAtributos() {

		String mensaje = "Nombre: " + nombre + "\n" + "Apellido: " +
				apellido + "\n" + documento.mostrarAtributos() + "\n" +
				"Edad: " + edad +  " y es " + (mayorEdad() ? "mayor de edad" : "menor de edad");
		return mensaje;
	}
	
	public byte asignarEdad() {
	//Hacemos casteo para convertir el dato en tipo byte ya que entero es mas grande
		Random nuevaEdad = new Random();
		return (byte) nuevaEdad.nextInt(127);

	}
}

