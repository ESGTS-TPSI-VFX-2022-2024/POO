import java.util.ArrayList;

public class Dossier {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private ArrayList<Fatura> docs = new ArrayList<Fatura>();
	private int paginaAtual;
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	
	  
	   
	// CONSTRUTOR DEFAULT

	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	public void AdicionarDoc(Fatura fact) {
		this.docs.add(fact);
	}
	
	public void RemoverFaturaAtual() {
		this.docs.remove(this.paginaAtual);
	}
	
	public void AvancarPagina() {
		this.paginaAtual++;
	}
	
	public void RecuarPagina() {
		this.paginaAtual--;
	}
	
	public void ProcurarFatura(String numero) {
		
		int paginaTemp = 0;
		
		for (Fatura fatura : this.docs) {
			if (fatura.getNumero() == numero) {
				this.paginaAtual = paginaTemp;
			}
			
			paginaTemp++;
		}
		
	}
	
	public String ImprimirPagina() {
		
		return this.docs.get(this.paginaAtual).Imprimir();
		
	}
	
	
	
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
