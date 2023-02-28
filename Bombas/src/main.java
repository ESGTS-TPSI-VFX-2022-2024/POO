import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criar um novo tabuleiro
		String[][] tabuleiro = CriarTabuleiro();
		
		int numeroTotalJogadas = 90;
		int numeroJogadasEfetuadas = 0;
		
		// Mostrar o tabuleiro ao utilizador
		System.out.println(MostrarTabuleiro(tabuleiro));
		
		boolean continuarJogo = true;
		Scanner sc = new Scanner(System.in);
		
		while (continuarJogo) {

			System.out.println("Qual a linha?");
			int linha = sc.nextInt()-1;
			System.out.println("Qual a coluna?");
			int coluna = sc.nextInt()-1;
			
			if (tabuleiro[linha][coluna] == null || tabuleiro[linha][coluna] == "-1") {
				
				continuarJogo = DesbloquearPosicao(tabuleiro, linha, coluna);
				numeroJogadasEfetuadas++;
				
				System.out.println(MostrarTabuleiro(tabuleiro));
				
				if (numeroJogadasEfetuadas == numeroTotalJogadas && continuarJogo == true) {
					System.out.println("GANHOU");
				} else {
					if (continuarJogo == false) {	
						System.out.println("PERDEU");	
					}
				}
				
			}
			
			
		}
		
		
		
		
	}
	
	//Metodo para criar um novo tabuleiro com bombas aleatórias
	public static String[][] CriarTabuleiro() {
		
		String[][] tabuleiro = new String[10][10];
		int numeroBombas = 10;
		Random rd = new Random();
		
		// Ciclo para criar 10 bombas aleatoriamente
		for (int i = 0; i < numeroBombas; i++) {
			
			int linha = 0;
			int coluna = 0;
			
			// Gerar posições aleatórias e verificar se já existe uma bomba nessa posição
			// Caso já exista, vai gerar uma nova posição aleatória
			do {
				linha = rd.nextInt(10);
				coluna = rd.nextInt(10);
			} while (tabuleiro[linha][coluna] == "-1");
			
			// Colocar bomba na posição aleatória
			tabuleiro[linha][coluna] = "-1";
			
		}
		
		return tabuleiro;
		
	}
	
	public static String MostrarTabuleiro(String[][] tabuleiro) {
		
		String resultado = "";
		
		for (int i = 0; i < tabuleiro.length; i++) {
			
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] != null && tabuleiro[i][j] != "-1") {
					resultado += " " + tabuleiro[i][j] + " ";
				} else {
					resultado += " X ";
				}
			}
			
			resultado += "\r\n";
			
		}
		
		return resultado;
		
	}
	
	public static boolean DesbloquearPosicao(String[][] tabuleiro, int linha, int coluna) {
		
		
		if (tabuleiro[linha][coluna] == "-1") {
			return false;
		} else {
			
			int contaBombas = 0;
			
			if (linha > 0 && coluna > 0) {
			
				if (tabuleiro[linha-1][coluna-1] == "-1") {
					contaBombas++;
				}
			
			}
			
			if (linha > 0) {
				if (tabuleiro[linha-1][coluna] == "-1") {
					contaBombas++;
				}
			}
			
			if (linha > 0 && coluna < tabuleiro[linha].length-1) {
				if (tabuleiro[linha-1][coluna+1] == "-1") {
					contaBombas++;
				}	
			}
			
			
			if (coluna > 0) {
				if (tabuleiro[linha][coluna-1] == "-1") {
					contaBombas++;
				}
			}
			
			if (coluna < tabuleiro[linha].length-1) {
				if (tabuleiro[linha][coluna+1] == "-1") {
					contaBombas++;
				}
			}
			
			if (linha < tabuleiro.length - 1 && coluna > 0) {
				if (tabuleiro[linha+1][coluna-1] == "-1") {
					contaBombas++;
				}
			}
			
			if (linha < tabuleiro.length - 1) {
				if (tabuleiro[linha+1][coluna] == "-1") {
					contaBombas++;
				}
			}
			
			if (linha < tabuleiro.length - 1 && coluna < tabuleiro[linha].length-1) {
				if (tabuleiro[linha+1][coluna+1] == "-1") {
					contaBombas++;
				}
			}
			
			tabuleiro[linha][coluna] = Integer.toString(contaBombas);
			
			return true;
			
		}
		
	}
	
}
