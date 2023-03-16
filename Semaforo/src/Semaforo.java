
public class Semaforo {

	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private boolean luzVermelha;
	private boolean luzAmarela;
	private boolean luzVerde;
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	public boolean isLuzVermelha() {
		return luzVermelha;
	}
	
	public boolean isLuzAmarela() {
		return luzAmarela;
	}
	
	public boolean isLuzVerde() {
		return luzVerde;
	}
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Semaforo() {
		this.luzVermelha = true;
	}
	   
	
	// CONSTRUTOR COM PARAMETROS
	
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================
	
	public void MudaEstado () {
		
		if (this
{
			this.luzVermelha = false;
			this.luzVerde = true;
		} else if (this.luzAmarela) {
			this.luzAmarela = false;
			this.luzVermelha = true;
		} else if (this.luzVerde) {
			this.luzVerde = false;
			this.luzAmarela = true;
		}
		
	}
	
	// =======================================================
	// ============== METODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	@Override
	public String toString() {
		
		if (this.luzVermelha) {
			return "Vermelho";
		} else if (this.luzAmarela) {
			return "Amarelo";
		} else if (this.luzVerde) {
			return "Verde";
		}
		
		return "";
		
	}
	
	
	// ----> equals()
	
}
