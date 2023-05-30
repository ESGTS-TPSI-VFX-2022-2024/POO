import java.util.ArrayList;

public class Escola {

	private ArrayList<Pessoa> Pessoas = new ArrayList<Pessoa>();
	
	public ArrayList<Pessoa> getPessoas() {
		return Pessoas;
	}

	public void AdicionarPessoa(Pessoa p1) {
		
		this.Pessoas.add(p1);
		
	}
	
	public void ApagarPessoa(int codigo) {
		
		
		for (Pessoa pessoa : this.Pessoas) {
			
			if (pessoa.getCodigo() == codigo) {
				this.Pessoas.remove(pessoa);
				break;
			}
			
		}
		
	}
	
	
	
	
}
