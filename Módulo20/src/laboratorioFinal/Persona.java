package laboratorioFinal;

import java.util.Random;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Documento documento;
	private byte edad;
	
	public Persona() {
		
	}

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

		String atributos = ("Nombre: " + nombre + "\n" + "Apellido: " +
				apellido + "\n" + "Tipo de Documento: " + documento.mostrarAtributos() + "\n" + "Edad: " + edad);
		
		return atributos;
	}

	// asignar edad
	public byte asignarEdad() {

		Random nuevaEdad = new Random();
		return (byte) nuevaEdad.nextInt(127);

	}

	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}
	
	
	
}
