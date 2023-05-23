
public class Coordenador extends Pessoa {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private Curso Curso;

	
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	
	   
	
	// CONSTRUTOR COM PARÂMETROS
	public Coordenador(String nome, String apelido) {
		super(nome, apelido);
		// TODO Auto-generated constructor stub
	}

	public Coordenador(String nome, String apelido, Curso curso) {
		super(nome, apelido);
		Curso = curso;
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
