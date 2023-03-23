public class Torneira {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private int caudal;
	private int caudalMaximo;
	private int caudalMinimo;
	
	private int temperatura;
	private int temperaturaMaxima;
	private int temperaturaMinima;
	
	private int saida; // 0 - Torneira | 1 - Chuveiro
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public int getCaudal() {
		return caudal;
	}
	
	public int getCaudalMaximo() {
		return caudalMaximo;
	}

	public void setCaudalMaximo(int caudalMaximo) {
		this.caudalMaximo = caudalMaximo;
	}

	public int getCaudalMinimo() {
		return caudalMinimo;
	}

	public void setCaudalMinimo(int caudalMinimo) {
		this.caudalMinimo = caudalMinimo;
	}
	
	public int getTemperatura() {
		return temperatura;
	}

	public int getTemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public void setTemperaturaMaxima(int temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}

	public int getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(int temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	
	   
	
	// CONSTRUTOR COM PARÂMETROS
	
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	public int aumentaCaudal(int valor) {
		
		if (this.caudal + valor > this.caudalMaximo) {
			this.caudal = this.caudalMaximo;
		} else {
			this.caudal = this.caudal + valor;
		}
		
		return this.caudal;
		
	}
	
	public int reduzirCaudal(int valor) {
		
		if (this.caudal - valor < this.caudalMinimo) {
			this.caudal = this.caudalMinimo;
		} else {
			this.caudal = this.caudal - valor;
		}
		
		return this.caudal;
		
	}
	
	public int aumentaTemperatura(int valor) {
		
		if (this.temperatura + valor > this.temperaturaMaxima) {
			this.temperatura = this.temperaturaMaxima;
		} else {
			this.temperatura = this.temperatura + valor;
		}
		
		return this.temperatura;
		
	}
	
	public int reduzirTemperatura(int valor) {
		
		if (this.temperatura - valor < this.temperaturaMinima) {
			this.temperatura = this.temperaturaMinima;
		} else {
			this.temperatura = this.temperatura - valor;
		}
		
		return this.temperatura;
		
	}
	
	public void mudarSaida() {
		
		this.saida = this.saida == 0 ? 1 : 0;
		
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
