import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa e1 = new Empresa();
		e1.setNome("ESGTS");
		e1.setNIF("5151511551");
		
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
		
		ProdutoComReferencia p5 = new ProdutoComReferencia();
		p5.setNome("Telemóvel");
		p5.setPreco(1);
		p5.setQtd(1);
		p5.setReferencia("fdsfds4515fd");
		
		ProdutoComData p6 = new ProdutoComData();
		p6.setNome("Iogurte");
		p6.setPreco(1);
		p6.setQtd(1);
		p6.setDataValidade(new Date(2023,10,10));
		
		ProdutoComReferencia p7 = new ProdutoComReferencia();
		p7.setNome("Telemóvel");
		p7.setPreco(1);
		p7.setQtd(1);
		p7.setReferencia("fdsfds111111");
		
		/*
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(p1);
		produtos.add(p2);
		*/
		
		f1.AdicionarProduto(p1);
		f1.AdicionarProduto(p2);
		f1.AdicionarProduto(p3);
		f1.AdicionarProduto(p4);
		f1.AdicionarProduto(p5);
		f1.AdicionarProduto(p6);
		f1.AdicionarProduto(p7);
		
		
		
		Fatura f2 = new Fatura();
		f2.setNumero("2");
		f2.setData(new Date());
		f2.setEmpresa(e1);
		
		f2.AdicionarProduto(p1);
		f2.AdicionarProduto(p2);
		
		Fatura f3 = new Fatura();
		f3.setNumero("3");
		f3.setData(new Date());
		f3.setEmpresa(e1);
		
		f3.AdicionarProduto(p1);
		
		//System.out.println(f1.Imprimir());
		
		Dossier d1 = new Dossier();
		d1.AdicionarDoc(f1);
		d1.AdicionarDoc(f2);
		d1.AdicionarDoc(f3);
		
		
		
		//d1.AvancarPagina();
		//d1.RemoverFaturaAtual();
		
		d1.ProcurarFatura("3");
		System.out.println(d1.ImprimirPagina());;
		
	}

}
