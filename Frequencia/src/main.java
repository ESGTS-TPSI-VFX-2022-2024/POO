
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa("Rafael", "Silva");
		p1.setApelido("Pedro");
		
		Aluno a1 = new Aluno("Pedro", "Costa", 15, 'M');
		Aluno a2 = new Aluno("Maria", "Joana", 10, 'F');
		Coordenador c1 = new Coordenador("João", "Maria");
		Funcionario f1 = new Funcionario("José", "Afonso");
		Turma t1 = new Turma();
		Curso cur1 = new Curso(t1, c1, f1);
		
		cur1.InscreverAluno(a1);
		cur1.InscreverAluno(a2);
		
		System.out.println(cur1.CalcularMedia());
		System.out.println(cur1.CalcularMedia('F'));
		System.out.println(cur1.CalcularMedia('M'));
		System.out.println(cur1.CursoPodeFuncionar());
		System.out.println(cur1.CursoPodeFuncionarFeminino());
		
	}

}
