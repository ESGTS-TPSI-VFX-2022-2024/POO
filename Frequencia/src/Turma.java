import java.util.ArrayList;

public class Turma {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private ArrayList<Aluno> Alunos = new ArrayList<Aluno>();
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	public ArrayList<Aluno> getAlunos() {
		return Alunos;
	}
	
	public ArrayList<Aluno> getAlunos(char sexo) {
		ArrayList<Aluno> alunosFiltrados = new ArrayList<Aluno>();
		
		for (Aluno aluno : this.Alunos) {
			if (aluno.getSexo() == sexo) {
				alunosFiltrados.add(aluno);
			}
		}
		
		return alunosFiltrados;
	}
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	
	   
	
	// CONSTRUTOR COM PARÂMETROS
	
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	public void AdicionarAluno(Aluno aluno) {
		this.Alunos.add(aluno);
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
