package desafio;

public class Usuario {

	private String correo;
	private String clave;

	public Usuario() {
		super();
	}

	public Usuario(String correo, String clave) {
		super();
		this.correo = correo;
		this.clave = clave;
	}

	public String getDatos() {
		return "Usuario [Correo: " + correo + ", Clave: " + clave + "]";
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
