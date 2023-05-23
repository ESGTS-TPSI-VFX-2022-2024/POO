
public class Funcionario extends Pessoa {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	

	private String Departamento;
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	
	   
	
	// CONSTRUTOR COM PARÂMETROS
	public Funcionario(String nome, String apelido) {
		super(nome, apelido);
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, String apelido, String departamento) {
		super(nome, apelido);
		Departamento = departamento;
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
