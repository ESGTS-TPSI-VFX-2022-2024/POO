
public class Aluno extends Pessoa {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private double NotaAcesso;
	
	private char Sexo;
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	public double getNotaAcesso() {
		return NotaAcesso;
	}
	
	public double getSexo() {
		return Sexo;
	}
	
	public void setSexo(char sexo) {
		this.Sexo = sexo;
	}
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	
	   
	
	// CONSTRUTOR COM PARÂMETROS
	public Aluno(String nome, String apelido) {
		super(nome, apelido);
		// TODO Auto-generated constructor stub
	}

	public Aluno(String nome, String apelido, double notaAcesso, char sexo) {
		super(nome, apelido);
		NotaAcesso = notaAcesso;
		Sexo = sexo;
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
