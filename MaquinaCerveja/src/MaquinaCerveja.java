
public class MaquinaCerveja {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private int capacidadeAtual;
	private final int CAPACIDADE_MAXIMA = 50;
	
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	public int getCapacidadeAtual() {
		return capacidadeAtual;
	}
	
	public int getCAPACIDADE_MAXIMA() {
		return CAPACIDADE_MAXIMA;
	}
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public MaquinaCerveja() {
		this.capacidadeAtual = 0;
	}
	   
	
	// CONSTRUTOR COM PARAMETROS
	
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	public void encherCopo() {
		
		if (this.capacidadeAtual > 0) {
			this.capacidadeAtual = this.capacidadeAtual - 1;
		}
		
		
	}
	
	public void recarregar(int numeroCopos) {
		
		if (this.capacidadeAtual + numeroCopos <= this.CAPACIDADE_MAXIMA) {
			this.capacidadeAtual = this.capacidadeAtual + numeroCopos;
		} else {
			this.capacidadeAtual = this.CAPACIDADE_MAXIMA;
		}
		
	}
	
	
	// =======================================================
	// ============== METODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()

	
	// ----> equals()
}
