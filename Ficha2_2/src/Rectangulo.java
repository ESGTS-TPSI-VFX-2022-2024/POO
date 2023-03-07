public class Rectangulo {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private double lado;
	private double area;
	private double perimetro;
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		if (lado > 0) {
			this.lado = lado;	
		}
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
	public Rectangulo() {
		
	}
	   
	
	// CONSTRUTOR COM PARÂMETROS
	public Rectangulo(double lado) {
		super();
		setLado(lado);
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	public void CalcularArea() {
		this.area = this.lado * this.lado;
	}

	public void CalcularPerimetro() {
		this.perimetro = 4 * this.lado;
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
