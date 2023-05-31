import java.util.Date;

public class Animal {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private double Peso;
	private String Cor;
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public double getPeso() {
		return Peso;
	}
	
	public void setPeso(double peso) {
		Peso = peso;
	}
	
	public String getCor() {
		return Cor;
	}
	
	public void setCor(String cor) {
		Cor = cor;
	}
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	
	   
	// CONSTRUTOR COM PARÂMETROS
	public Animal(double peso, String cor) {
		super();
		Peso = peso;
		Cor = cor;
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	public String EmitirSom() {
		return "SOM";
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
