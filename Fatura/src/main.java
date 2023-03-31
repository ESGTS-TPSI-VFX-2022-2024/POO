import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa e1 = new Empresa();
		e1.setNome("ESGTS");
		e1.setNif("5151511551");
		
		Fatura f1 = new Fatura();
		f1.setNumero("1");
		f1.setData(new Date());
		f1.setEmpresa(e1);
		
		Produto p1 = new Produto();
		p1.setNome("Pao");
		p1.setPreco(1);
		p1.setQtd(1);
		
		Produto p2 = new Produto();
		p2.setNome("Água");
		p2.setPreco(2);
		p2.setQtd(1);
		
		Produto p3 = new Produto();
		p3.setNome("Água");
		p3.setPreco(2);
		p3.setQtd(1);
		
		Produto p4 = new Produto();
		p4.setNome("Água");
		p4.setPreco(1);
		p4.setQtd(1);
		
		/*
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(p1);
		produtos.add(p2);
		*/
		
		f1.AdicionarProduto(p1);
		f1.AdicionarProduto(p2);
		f1.AdicionarProduto(p3);
		f1.AdicionarProduto(p4);
		
		System.out.println(f1.Imprimir());
		
	}

}
