import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Qual o numero?");
			numero = sc.nextInt();
		} while (numero < 0 || numero > 20);
		
		if (numero < 5) {
			System.out.println("Abaixo");
		} else if (numero > 15) {
			System.out.println("Acima");
		} else {
			System.out.println("Dentro");
		}
		
		
	}

}
