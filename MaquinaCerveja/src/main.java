
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaquinaCerveja m1 = new MaquinaCerveja();
		
		System.out.println(m1.getCapacidadeAtual());
		
		m1.recarregar(25);
		
		for (int i = 0; i < 10; i++) {
			m1.encherCopo();
			
		}
		
		
		System.out.println(m1.getCapacidadeAtual());
		
		while (m1.getCapacidadeAtual() > 0) {
			m1.encherCopo();
		}
		
		System.out.println(m1.getCapacidadeAtual());
		
	}

}
