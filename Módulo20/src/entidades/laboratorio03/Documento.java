package entidades.laboratorio03;

public class Documento {

	 String tipoDocumento;
	 int numeroDocumento;
	
	// constructor con todos los atributos
	public Documento(String tipoDocumento, int numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	
	public String mostrarAtributos() {
		return "Tipo de Documento: " + tipoDocumento.toUpperCase() + ", Numero de Documento: " + numeroDocumento;
	}
	
}
