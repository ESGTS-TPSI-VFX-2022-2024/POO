
public class Pessoa {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String Nome;
	private String Apelido;
	
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	public String getNome() {
		return Nome;
	}

	public String getApelido() {
		return Apelido;
	}
	
	public void setApelido(String apelido) {
		Apelido = apelido;
	}
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	
	   
	
	// CONSTRUTOR COM PAR�METROS
	public Pessoa(String nome, String apelido) {
		super();
		Nome = nome;
		Apelido = apelido;
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	
	
	// =======================================================
	// ============== M�TODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
