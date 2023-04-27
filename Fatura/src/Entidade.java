public class Entidade {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String nome;
	private String morada;
	private String nif;
	private String contacto;
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMorada() {
		return morada;
	}
	
	public void setMorada(String morada) {
		this.morada = morada;
	}
	
	public String getNIF() {
		return nif;
	}
	
	public void setNIF(String nIF) {
		nif = nIF;
	}
	
	public String getContacto() {
		return contacto;
	}
	
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Entidade() {
		
	}
	   
	
	// CONSTRUTOR COM PARÂMETROS
	public Entidade(String nome, String morada, String nIF, String contacto) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.nif = nIF;
		this.contacto = contacto;
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	public String Imprimir() {
		
		String resultado = "";
		
		resultado += "Nome: " + this.nome + "\r\n";
		resultado += "Morada: " + this.morada + "\r\n";
		resultado += "NIF: " + this.nif + "\r\n";
		resultado += "Contacto: " + this.contacto + "\r\n";
		
		return resultado;
		
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
