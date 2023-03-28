import java.util.Date;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a) Criar um cartão vazio;
		Cartao c1 = new Cartao();
		System.out.println(c1);
		
		//b) Criar um cartão com todos os elementos preenchidos;
		Cartao c2 = new Cartao(
				"José", 
				new Date(0), 
				"1111", 
				"111", 
				"151", 
				"111", 
				"1111",
				'M',
				"dsadsa",
				"151510");
		
		System.out.println(c2);
		
		// c) Consultar individualmente cada elemento do cartão;
		System.out.println(c2.getNrDocIdentificacao());
		System.out.println(c2.getNome());
		
	}

}
