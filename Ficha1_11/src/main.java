import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// Variaveis
		double lado, raio, lado2, raio2;
		double perimetroR, areaR, perimetroC, areaC;
		double perimetroR2, areaR2, perimetroC2, areaC2;
		
		// Perguntar ao utilizador
		System.out.println("Qual o lado?");
		lado = sc.nextDouble();
		
		System.out.println("Qual o raio?");
		raio = sc.nextDouble();
		
		System.out.println("Qual o lado 2?");
		lado2 = sc.nextDouble();
		
		System.out.println("Qual o raio 2?");
		raio2 = sc.nextDouble();
		
		perimetroR = 4 * lado;
		areaR = lado * lado;
		
		perimetroR2 = 4 * lado2;
		areaR2 = lado2 * lado2;
		
		perimetroC = 2 * Math.PI * raio2;
		areaC = Math.PI * Math.pow(raio2, 2);
		
		perimetroC2 = 2 * Math.PI * raio2;
		areaC2 = Math.PI * Math.pow(raio2, 2);
		
		System.out.println("Perimetro R: " + perimetroR);
		System.out.println("Area R: " + areaR);
		System.out.println("Perimetro C: " + perimetroC);
		System.out.println("Area C: " + areaC);
		
		System.out.println("Perimetro R 2: " + perimetroR2);
		System.out.println("Area R 2: " + areaR2);
		System.out.println("Perimetro C 2: " + perimetroC2);
		System.out.println("Area C 2: " + areaC2);
		
	}

}
