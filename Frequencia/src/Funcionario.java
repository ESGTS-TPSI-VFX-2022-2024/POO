
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
	
	   
	
	// CONSTRUTOR COM PAR�METROS
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
	// ============== M�TODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
