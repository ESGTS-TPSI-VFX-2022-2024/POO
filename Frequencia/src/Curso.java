
public class Curso {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private Turma Turma;
	private Coordenador Coordenador;
	private Funcionario Funcionario;
	
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	
	   
	
	// CONSTRUTOR COM PARÂMETROS
	public Curso(Turma turma, Coordenador coordenador, Funcionario funcionario) {
		super();
		Turma = turma;
		Coordenador = coordenador;
		Funcionario = funcionario;
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	public void InscreverAluno(Aluno aluno) {
		this.Turma.AdicionarAluno(aluno);
	}
	
	public double CalcularMedia() {
		double media;
		double somaNotas = 0;
		
		for (Aluno aluno : this.Turma.getAlunos()) {
			somaNotas = somaNotas + aluno.getNotaAcesso();
		}
		
		media = somaNotas / this.Turma.getAlunos().size();
		
		return media;
	}
	
	public double CalcularMedia(char sexo) {
		double media;
		double somaNotas = 0;
		
		for (Aluno aluno : this.Turma.getAlunos(sexo)) {
			somaNotas = somaNotas + aluno.getNotaAcesso();
		}
		
		media = somaNotas / this.Turma.getAlunos(sexo).size();
		
		return media;
	}
	
	public boolean CursoPodeFuncionar() {
		return (this.Turma.getAlunos().size() >= 15);
	}
	
	public boolean CursoPodeFuncionarFeminino() {
		return CursoPodeFuncionar() && (this.Turma.getAlunos('F').size() >= (this.Turma.getAlunos().size() * 0.20));
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
