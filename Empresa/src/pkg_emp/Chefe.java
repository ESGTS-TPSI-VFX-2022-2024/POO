package pkg_emp;

public class Chefe extends Vendedor {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private double percentagemIsencao;

	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	
	public double getPercentagemIsencao() {
		return percentagemIsencao;
	}

	public void setPercentagemIsencao(double percentagemIsencao) {
		this.percentagemIsencao = percentagemIsencao;
	}
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Chefe() {
		super();
	}
	
	// CONSTRUTOR COM PAR�METROS
	public Chefe(double percentagemIsencao) {
		super();
		this.percentagemIsencao = percentagemIsencao;
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	@Override
	public double CalcularOrdenadoFinal() {
		
		this.ordenadoFinal = super.CalcularOrdenadoFinal() 
				+ (this.getOrdenado() * this.percentagemIsencao);
		
		return this.ordenadoFinal;
		
	}
	
	// =======================================================
	// ============== M�TODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
	
}
