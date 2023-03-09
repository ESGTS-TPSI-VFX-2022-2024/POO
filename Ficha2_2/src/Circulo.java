public class Circulo {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private double raio;
	private double area;
	private double perimetro;
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimetro() {
		return perimetro;
	}

	
	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Circulo() {
		
	}
	
	
	// CONSTRUTOR COM PARÂMETROS
	public Circulo(double raio) {
		super();
		this.raio = raio;
	}
	
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	public void CalcularArea() {

		this.area = Math.PI * Math.pow(this.raio,2);
		
	}
	
	public void CalcularPerimetro() {
		this.perimetro = 2 * Math.PI * this.raio;
	}

	
	
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", area=" + area + ", perimetro=" + perimetro + "]";
	}
	
	
	// ----> equals()
}
