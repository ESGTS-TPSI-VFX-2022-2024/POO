import java.util.Date;

public class Fatura {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String numero;
	private Date data;
	private Empresa empresa;
	
	
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
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
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
		
		resultado += "-----------------------------------\r\n";
		resultado += "DADOS DA EMPRESA\r\n";
		resultado += "-----------------------------------\r\n";
		
		resultado += this.empresa.Imprimir();
		
		return resultado;
		
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
	
}
