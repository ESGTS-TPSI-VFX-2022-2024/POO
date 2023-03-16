import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Semaforo s1 = new Semaforo();
		Semaforo s2 = s1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(s1);
		
		s1.MudaEstado();
		
		System.out.println(s1);
		
		s1.MudaEstado();
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
