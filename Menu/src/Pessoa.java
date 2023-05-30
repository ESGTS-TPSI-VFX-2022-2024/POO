
public class Pessoa {

	private int Codigo;
	private String Nome;
	private String Email;
	
	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public Pessoa(int codigo, String nome, String email) {
		super();
		Codigo = codigo;
		Nome = nome;
		Email = email;
	}
	
}
