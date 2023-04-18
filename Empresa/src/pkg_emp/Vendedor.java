package pkg_emp;

public class Vendedor extends Trabalhador {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	
	private double percentagemVendas;
	private double valorVendas;
	
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	
	public double getPercentagemVendas() {
		return percentagemVendas;
	}
	public void setPercentagemVendas(double percentagemVendas) {
		this.percentagemVendas = percentagemVendas;
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Vendedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// CONSTRUTOR COM PARÂMETROS
	
	public Vendedor(String nome, String nrIdentificacao, String telefone, String nIF, double ordenado,
			double ordenadoFinal, double percentagemVendas, double valorVendas) {
		super(nome, nrIdentificacao, telefone, nIF, ordenado, ordenadoFinal);
		this.percentagemVendas = percentagemVendas;
		this.valorVendas = valorVendas;
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	@Override
	public double CalcularOrdenadoFinal() {
		
		this.ordenadoFinal = this.getOrdenado() + 
				(this.valorVendas * this.percentagemVendas);
		
		return this.getOrdenadoFinal();
		
	}

	
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
