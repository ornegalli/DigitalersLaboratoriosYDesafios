package laboratorio02;

public class Documento {

		String tipoDocumento;
		int numeroDocumento;
		
		// constructor con todos los atributos
		Documento(String tipoDocumento, int numeroDocumento) {
			this.tipoDocumento = tipoDocumento;
			this.numeroDocumento = numeroDocumento;
		}

		
		String mostrarAtributos() {
			return "Tipo de Documento: " + tipoDocumento.toUpperCase() + ", Numero de Documento: " + numeroDocumento;
		}
		
}