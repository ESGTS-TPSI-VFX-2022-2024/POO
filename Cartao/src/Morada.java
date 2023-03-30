import java.util.Objects;

public class Morada implements Cloneable {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	
	private int codigoPostal4;
	private int codigoPostal3;
	private String rua;
	private String nrPortaAndar;
	private String localidade;
	
	
	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public int getCodigoPostal4() {
		return codigoPostal4;
	}
	
	public void setCodigoPostal4(int codigoPostal4) {
		this.codigoPostal4 = codigoPostal4;
	}
	
	public int getCodigoPostal3() {
		return codigoPostal3;
	}
	
	public void setCodigoPostal3(int codigoPostal3) {
		this.codigoPostal3 = codigoPostal3;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getNrPortaAndar() {
		return nrPortaAndar;
	}
	
	public void setNrPortaAndar(String nrPortaAndar) {
		this.nrPortaAndar = nrPortaAndar;
	}
	
	public String getLocalidade() {
		return localidade;
	}
	
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	
	
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================
	
	  
	   
	// CONSTRUTOR DEFAULT
	public Morada() {
		
	}
	   
	
	// CONSTRUTOR COM PARÂMETROS
	public Morada(int codigoPostal4, int codigoPostal3, String rua, String nrPortaAndar, String localidade) {
		super();
		this.codigoPostal4 = codigoPostal4;
		this.codigoPostal3 = codigoPostal3;
		this.rua = rua;
		this.nrPortaAndar = nrPortaAndar;
		this.localidade = localidade;
	}
	
	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	
	
	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================
	
	// ----> toString()
	
	
	
	// ----> equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Morada other = (Morada) obj;
		
		return codigoPostal3 == other.codigoPostal3 
				&& codigoPostal4 == other.codigoPostal4
				&& Objects.equals(localidade, other.localidade) 
				&& Objects.equals(nrPortaAndar, other.nrPortaAndar)
				&& Objects.equals(rua, other.rua);
	}
	
	@Override
	public Morada clone() throws CloneNotSupportedException {
		
		if (this.codigoPostal4 == 2120) {
			throw new CloneNotSupportedException("Não é possivel clonar moradas com o código postal 2120");
		} else if (this.codigoPostal3 == 188) {
			throw new CloneNotSupportedException("Não é possivel clonar moradas com o código postal 188");
		}
		else {
			return (Morada)super.clone();
		}
		
	}
	
}
