public class Empresa extends Entidade {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private int cae;
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public int getCae() {
		return cae;
	}


	public void setCae(int cae) {
		this.cae = cae;
	}
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	// CONSTRUTOR COM PAR�METROS
	public Empresa(String nome, String morada, String nIF, String contacto) {
		super(nome, morada, nIF, contacto);
		// TODO Auto-generated constructor stub
	}
	
	public Empresa(String nome, String morada, String nIF, String contacto, int cae) {
		super(nome, morada, nIF, contacto);
		this.cae = cae;
		// TODO Auto-generated constructor stub
	}
	
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	@Override
	public String Imprimir() {
		
		String resultado = super.Imprimir();
		
		resultado += "CAE: " + this.cae + "\r\n";
		
		return resultado;
		
	}


	
	
	// =======================================================
	// ============== M�TODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
}
