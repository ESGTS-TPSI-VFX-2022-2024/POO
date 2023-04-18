package pkg_emp;

public class Trabalhador {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String nome;
	private String nrIdentificacao;
	private String telefone;
	private String NIF;
	private double ordenado;
	protected double ordenadoFinal;
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNrIdentificacao() {
		return nrIdentificacao;
	}
	
	public void setNrIdentificacao(String nrIdentificacao) {
		this.nrIdentificacao = nrIdentificacao;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getNIF() {
		return NIF;
	}
	
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	
	public double getOrdenado() {
		return ordenado;
	}
	
	public void setOrdenado(double ordenado) {
		this.ordenado = ordenado;
	}
	
	public double getOrdenadoFinal() {
		return ordenadoFinal;
	}
	
	public void setOrdenadoFinal(double ordenadoFinal) {
		this.ordenadoFinal = ordenadoFinal;
	}

	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Trabalhador() {
		
	}
	   
	
	// CONSTRUTOR COM PARÂMETROS
	public Trabalhador(String nome, String nrIdentificacao, String telefone, String nIF, double ordenado,
			double ordenadoFinal) {
		super();
		this.nome = nome;
		this.nrIdentificacao = nrIdentificacao;
		this.telefone = telefone;
		NIF = nIF;
		this.ordenado = ordenado;
		this.ordenadoFinal = ordenadoFinal;
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	public double CalcularOrdenadoFinal() {
		
		this.ordenadoFinal = this.ordenado;
		
		return this.ordenadoFinal;
		
	}

	
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	@Override
	public String toString() {
		return "Trabalhador [nome=" + nome + ", nrIdentificacao=" + nrIdentificacao + ", telefone=" + telefone
				+ ", NIF=" + NIF + ", ordenado=" + ordenado + ", ordenadoFinal=" + ordenadoFinal + "]";
	}
	
	
	// ----> equals()
}
