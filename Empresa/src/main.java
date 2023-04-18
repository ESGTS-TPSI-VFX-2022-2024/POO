import pkg_emp.Trabalhador;
import pkg_emp.Vendedor;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// TRABALHADOR
		Trabalhador t1 = new Trabalhador();
		t1.setNome("João");
		t1.setNIF("15415151");
		t1.setNrIdentificacao("1541515");
		t1.setTelefone("25151");
		t1.setOrdenado(1000);
		t1.CalcularOrdenadoFinal();
		System.out.println(t1);
		
		// VENDEDOR
		Vendedor v1 = new Vendedor();
		v1.setNome("Pedro");
		v1.setNIF("15415151");
		v1.setNrIdentificacao("1541515");
		v1.setTelefone("25151");
		v1.setOrdenado(1000);
		v1.setValorVendas(1000);
		v1.setPercentagemVendas(0.10);
		v1.CalcularOrdenadoFinal();
		System.out.println(v1);
		
		//t1.ordenadoFinal = 0;
		
	}

}
