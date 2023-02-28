import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {
		int mes, dias;
		mes = lerMes();
		dias = numeroDeDias(mes);
		System.out.printf("O m�s " + mes + " tem " + dias + " dias");
		
	}
	
	public static int lerMes() {
		// este m�todo l� o n� do m�s
		int mes;
		Scanner LerS = new Scanner(System.in);
		
		do {
			System.out.println("Qual o m�s?");
			mes = LerS.nextInt();
		} while (mes < 1 || mes > 12);
		
		return mes;
		
	}
	
	public static int numeroDeDias(int mes) {
	// este m�todo recebe o n�mero dum m�s e retorna o seu n�mero de dias
	
		int nrDias;
		
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			nrDias = 31;
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			nrDias = 30;
		} else {
			nrDias = 28;
		}
		
		return nrDias;
		
	}

}
