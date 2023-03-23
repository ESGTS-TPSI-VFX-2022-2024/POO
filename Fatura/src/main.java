import java.util.Date;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fatura f1 = new Fatura();
		f1.setNumero("1");
		f1.setData(new Date());
		
		System.out.println(f1.Imprimir());
		
	}

}
