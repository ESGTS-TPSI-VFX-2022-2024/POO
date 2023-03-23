import java.util.Date;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa e1 = new Empresa();
		e1.setNome("ESGTS");
		e1.setNif("5151511551");
		
		Fatura f1 = new Fatura();
		f1.setNumero("1");
		f1.setData(new Date());
		f1.setEmpresa(e1);
		
		System.out.println(f1.Imprimir());
		
	}

}
