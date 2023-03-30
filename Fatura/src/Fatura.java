import java.util.ArrayList;
import java.util.Date;

public class Fatura {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String numero;
	private Date data;
	private Empresa empresa;
	private ArrayList<Produto> produtos;
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
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
		
		resultado += "-----------------------------------\r\n";
		resultado += "PRODUTOS\r\n";
		resultado += "-----------------------------------\r\n";
		
		for (Produto produto : this.produtos) {
			resultado += produto.Imprimir() + "\r\n";
		}
		
		return resultado;
		
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
	
}
