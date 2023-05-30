import java.util.ArrayList;
import java.util.Scanner;

public class main {

	static Scanner sc = new Scanner(System.in);
	
	static Escola e1 = new Escola();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcaoEscolhida;
		
		do {
			
			System.out.println("########################");
			System.out.println("1 - Adicionar Pessoa");
			System.out.println("2 - Apagar Pessoa");
			System.out.println("3 - Listar Pessoas");
			System.out.println("0 - SAIR");
			System.out.println("########################");
			
			System.out.println("Escolha uma opção?");
			opcaoEscolhida = sc.nextInt();
			
			switch (opcaoEscolhida) {
				case 1:
					AdicionarPessoa();
					break;
				case 2:
					ApagarPessoa();
					break;
				case 3:
					ListarPessoas();
					break;
				default:
					break;
			}
			
		} while (opcaoEscolhida != 0);
		
		
		
	}

	private static void ListarPessoas() {
		// TODO Auto-generated method stub
		
		for (Pessoa pessoa : e1.getPessoas()) {
			
			System.out.println("------------------------------");
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Email: " + pessoa.getEmail());
			System.out.println("------------------------------");	
			
		}
		
		
	}

	private static void ApagarPessoa() {
		// TODO Auto-generated method stub
		
		System.out.println("Qual o codigo que deseja apagar?");
		int codigo = sc.nextInt();
		
		e1.ApagarPessoa(codigo);
		
	}

	private static void AdicionarPessoa() {
		// TODO Auto-generated method stub
		
		System.out.println("Qual o codigo?");
		int codigo = sc.nextInt();
		
		System.out.println("Qual o nome da pessoa?");
		String nome = sc.next();
		
		System.out.println("Qual o email?");
		String email = sc.next();
		
		Pessoa p1 = new Pessoa(codigo, nome, email);
		e1.AdicionarPessoa(p1);
		
	}

}
