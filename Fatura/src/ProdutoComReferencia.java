public class ProdutoComReferencia extends Produto {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	private String referencia;
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	 
	
	
	// CONSTRUTOR COM PAR�METROS
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	@Override
	public String Imprimir() {
		
		return super.Imprimir() + " | " + this.referencia;
		
	}
	
	// =======================================================
	// ============== M�TODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
	@Override
	public boolean equals(Object obj) {
		
		if (super.equals(obj)) {
			ProdutoComReferencia other = (ProdutoComReferencia) obj;
			
			return referencia == other.referencia;
		} else {
			return false;
		}
		
	}
}
