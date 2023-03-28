import java.util.Date;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		// a) Criar um cartão vazio;
		Cartao c1 = new Cartao();
		System.out.println(c1);
		
		//b) Criar um cartão com todos os elementos preenchidos;
		Morada m1 = new Morada(2120, 182, "1", "1", "dfdsfd");
		Cartao c2 = new Cartao(
				"José", 
				new Date(0), 
				"1111", 
				"111", 
				"1111",
				'M',
				"dsadsa",
				"151510",
				m1);
		
		System.out.println(c2);
		
		// c) Consultar individualmente cada elemento do cartão;
		System.out.println(c2.getNrDocIdentificacao());
		System.out.println(c2.getNome());
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o nome?");
		String nome = sc.nextLine();
		
		System.out.println("Qual o telemóvel?");
		String telemovel = sc.nextLine();
		
		System.out.println("Qual o email?");
		String email = sc.nextLine();
		
		System.out.println("Qual o NIF?");
		String nif = sc.nextLine();
		
		System.out.println("Qual o sexo?");
		char sexo = sc.nextLine().toCharArray()[0];
		
		System.out.println("Qual o Tipo Doc?");
		String tipoDoc = sc.nextLine();
		
		System.out.println("Qual o Nr Doc?");
		String nrDoc = sc.nextLine();
		
		
		System.out.println("Qual o CP4?");
		int cp4 = sc.nextInt();
		
		System.out.println("Qual o CP3?");
		int cp3 = sc.nextInt();
		
		System.out.println("Qual a rua?");
		String rua = sc.nextLine();
		
		System.out.println("Qual o numero da porta/andar?");
		String nrPortaAndar = sc.nextLine();
		
		System.out.println("Qual a localidade?");
		String localidade = sc.nextLine();
		
		Morada m2 = new Morada(cp4, cp3, rua, nrPortaAndar, localidade);
		Cartao c3 = new Cartao(nome, 
				new Date(0), 
				telemovel, 
				email, 
				nif,
				sexo,
				tipoDoc,
				nrDoc,
				m2);
		
	}

}
