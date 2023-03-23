public class Empresa {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String nome;
	private String nif;
	
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNif() {
		return nif;
	}
	
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Empresa() {
		
	}
	   
	
	// CONSTRUTOR COM PARÂMETROS
	
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	public String Imprimir() {
		
		String resultado = "";
		
		resultado += "Nome: " + this.nome + "\r\n";
		resultado += "NIF: " + this.nif + "\r\n";
		
		return resultado;
		
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
