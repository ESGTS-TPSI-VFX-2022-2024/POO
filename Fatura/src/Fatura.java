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
	   
	
	// CONSTRUTOR COM PAR�METROS
	
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	public String Imprimir() {
		
		String resultado = "";
		
		resultado += "N�mero: " + this.numero + "\r\n";
		resultado += "Data: " + this.data + "\r\n";
		
		return resultado;
		
	}
	
	// =======================================================
	// ============== M�TODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
	
}
