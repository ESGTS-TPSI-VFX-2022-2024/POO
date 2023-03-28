import java.util.Date;

public class Cartao {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private String nome;
	private Date dataNascimento;
	private String telemovel;
	private String email;
	private String NIF;
	private char sexo;
	private String tipoDocIdentificacao;
	private String nrDocIdentificacao;
	private Morada morada;
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	
	public Morada getMorada() {
		return morada;
	}

	public void setMorada(Morada morada) {
		this.morada = morada;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getTelemovel() {
		return telemovel;
	}
	
	public void setTelemovel(String telemovel) {
		this.telemovel = telemovel;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNIF() {
		return NIF;
	}
	
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String getTipoDocIdentificacao() {
		return tipoDocIdentificacao;
	}
	
	public void setTipoDocIdentificacao(String tipoDocIdentificacao) {
		this.tipoDocIdentificacao = tipoDocIdentificacao;
	}
	
	public String getNrDocIdentificacao() {
		return nrDocIdentificacao;
	}
	
	public void setNrDocIdentificacao(String nrDocIdentificacao) {
		this.nrDocIdentificacao = nrDocIdentificacao;
	}

	
	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Cartao() {
		
	}
	   
	// CONSTRUTOR COM PARÂMETROS
	public Cartao(String nome, Date dataNascimento, String telemovel,
			String email, String nIF, char sexo, String tipoDocIdentificacao, String nrDocIdentificacao,
			Morada morada) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telemovel = telemovel;
		this.email = email;
		this.NIF = nIF;
		this.sexo = sexo;
		this.tipoDocIdentificacao = tipoDocIdentificacao;
		this.nrDocIdentificacao = nrDocIdentificacao;
		this.morada = morada;
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
