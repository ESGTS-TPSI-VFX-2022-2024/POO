import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] v1 = new int[50];
		int contaMenoresNove = 0;
		int contaDezQuinze = 0;
		int contaMaiorQuinze = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < v1.length; i++) {
			
			do {
				System.out.println("Qual o numero?");
				v1[i] = sc.nextInt();
			} while(v1[i] < 0 || v1[i] > 20);
			
		}
		
		for (int i = 0; i < v1.length; i++) {
			
			if (v1[i] <= 9) {
				contaMenoresNove++;
			} else if (v1[i] > 15){
				contaMaiorQuinze++;
			} else {
				contaDezQuinze++;
			}
			
		}
		
		
	}

}
