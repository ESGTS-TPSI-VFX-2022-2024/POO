import java.util.Date;

public class Fatura {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String numero;
	private Date data;
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Fatura() {
		
	}
	   
	
	// CONSTRUTOR COM PARÂMETROS
	
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	public String Imprimir() {
		
		String resultado = "";
		
		resultado += "Número: " + this.numero + "\r\n";
		resultado += "Data: " + this.data + "\r\n";
		
		return resultado;
		
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
	
}
