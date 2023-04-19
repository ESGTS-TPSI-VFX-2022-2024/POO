package pkg_emp;

public class Administrador extends Trabalhador {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private double ajudasCusto;
	private double despesasRepresentacao;
	

	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public double getAjudasCusto() {
		return ajudasCusto;
	}
	
	public void setAjudasCusto(double ajudasCusto) {
		this.ajudasCusto = ajudasCusto;
	}
	
	public double getDespesasRepresentacao() {
		return despesasRepresentacao;
	}
	
	public void setDespesasRepresentacao(double despesasRepresentacao) {
		this.despesasRepresentacao = despesasRepresentacao;
	}
	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	
	
	// CONSTRUTOR COM PARÂMETROS
	
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	@Override
	public double CalcularOrdenadoFinal() {
		
		this.ordenadoFinal = super.getOrdenado() 
				+ this.despesasRepresentacao 
				+ this.ajudasCusto;
		
		return this.ordenadoFinal;
		
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
