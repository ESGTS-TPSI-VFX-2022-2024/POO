import java.util.ArrayList;
import java.util.Date;

public class Fatura {
	
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String numero;
	private Date data;
	private Empresa empresa;
	private Cliente cliente;
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private double valorTotal;
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

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
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
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

	public void AdicionarProduto(Produto produtoAdd) {
		
		boolean produtoNovo = true;
		
		// Percorrer todos os produtos da fatura
		for (Produto produto : this.produtos) {
			// Se o produto a adicionar for igual ao produto da fatura, adiciona qtd
			if (produto.equals(produtoAdd)) {
				produto.setQtd(produto.getQtd() + produtoAdd.getQtd());
				produtoNovo = false;
			}
		}
		
		if (produtoNovo) {
			this.produtos.add(produtoAdd);
		}
		
		CalcularValorTotal();
		
	}
	
	public void CalcularValorTotal() {
		
		double valor = 0;
		
		for (Produto produto : this.produtos) {
			valor = valor + (produto.getPreco() * produto.getQtd());
		}
		
		this.valorTotal = valor;
		
	}
	
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
		
		resultado += "-----------------------------------\r\n";
		resultado += "TOTAL\r\n";
		resultado += "-----------------------------------\r\n";
		
		resultado += this.valorTotal;
		
		return resultado;
		
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
	
}
