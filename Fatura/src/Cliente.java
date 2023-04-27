import java.util.Date;

public class Cliente extends Entidade {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private Date dataNascimento;
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	// CONSTRUTOR COM PARÂMETROS
	public Cliente(String nome, String morada, String nIF, String contacto) {
		super(nome, morada, nIF, contacto);
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String nome, String morada, String nIF, String contacto, Date dataNascimento) {
		super(nome, morada, nIF, contacto);
		this.dataNascimento = dataNascimento;
		// TODO Auto-generated constructor stub
	}

	
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	@Override
	public String Imprimir() {
		
		String resultado = super.Imprimir();
		
		resultado += "Data Nascimento: " + this.dataNascimento + "\r\n";
		
		return resultado;
		
	}
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	
	// ----> equals()
}
