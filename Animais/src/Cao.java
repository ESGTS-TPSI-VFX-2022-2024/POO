
public class Cao extends Animal {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String Raca;
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	public String getRaca() {
		return Raca;
	}


	public void setRaca(String raca) {
		Raca = raca;
	}

	
	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	
	   
	// CONSTRUTOR COM PARÂMETROS
	public Cao(double peso, String cor, String raca) {
		super(peso, cor);
		this.Raca = raca;
		// TODO Auto-generated constructor stub
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	public String EmitirSom() {
		return "LADRAR";
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
