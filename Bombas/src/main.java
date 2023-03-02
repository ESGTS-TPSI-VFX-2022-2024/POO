import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criar um novo tabuleiro
		String[][] tabuleiro = CriarTabuleiro();
		
		// Mostrar o tabuleiro ao utilizador
		System.out.println(MostrarTabuleiro(tabuleiro, true));
		
		Jogar(tabuleiro);
		
	}
	
	public static void Jogar(String[][] tabuleiro) {
		
		int numeroTotalJogadas = (tabuleiro.length * tabuleiro[0].length) - ContarBombas(tabuleiro);
		int numeroJogadasEfetuadas = 0;
		boolean continuarJogo = true;
		Scanner sc = new Scanner(System.in);
		
		while (continuarJogo) {
			
			int linha = 0;
			int coluna = 0;
			
			do {
				System.out.println("Qual a linha?");
				linha = sc.nextInt()-1;
			} while(linha < 0 || linha >= tabuleiro.length);
			
			do {
				System.out.println("Qual a coluna?");
				coluna = sc.nextInt()-1;
			} while(coluna < 0 || coluna >= tabuleiro[linha].length);
			
			
			if (tabuleiro[linha][coluna] == null || tabuleiro[linha][coluna] == "B") {
				
				continuarJogo = DesbloquearPosicao(tabuleiro, linha, coluna);
				numeroJogadasEfetuadas++;
				
				if (numeroJogadasEfetuadas == numeroTotalJogadas && continuarJogo == true) {
					System.out.println("GANHOU");
					continuarJogo = false;
				} else {
					if (continuarJogo == false) {	
						System.out.println("PERDEU");	
					}
				}
				
				System.out.println(MostrarTabuleiro(tabuleiro, continuarJogo));
				
			}
		}
		
	}
	
	//Metodo para criar um novo tabuleiro com bombas aleatórias
	public static String[][] CriarTabuleiro() {
		
		Scanner sc = new Scanner(System.in);
		
		int linhas = 0;
		do {
			System.out.println("Quantas linhas?");
			linhas = sc.nextInt();	
		} while(linhas <= 1);
		
		int colunas = 0;
		do {
			System.out.println("Quantas colunas?");
			colunas = sc.nextInt();
		} while (colunas <= 1);
		
		int nivel = 0;
		int numeroBombas = 0;
		do {
			System.out.println("Qual o nivel?");
			nivel = sc.nextInt();
			numeroBombas = (int)((linhas*colunas) * ((double)nivel/10.0));
		} while(nivel <= 0 || nivel >= 10 || numeroBombas == 0);
		
		String[][] tabuleiro = new String[linhas][colunas];
		
		
		System.out.println("Foram carregadas " + numeroBombas + " bombas!");
		Random rd = new Random();
		
		// Ciclo para criar 10 bombas aleatoriamente
		for (int i = 0; i < numeroBombas; i++) {
			
			int linha = 0;
			int coluna = 0;
			
			// Gerar posições aleatórias e verificar se já existe uma bomba nessa posição
			// Caso já exista, vai gerar uma nova posição aleatória
			do {
				linha = rd.nextInt(linhas);
				coluna = rd.nextInt(colunas);
			} while (tabuleiro[linha][coluna] == "B");
			
			// Colocar bomba na posição aleatória
			tabuleiro[linha][coluna] = "B";
			
		}
		
		return tabuleiro;
		
	}
	
	public static String MostrarTabuleiro(String[][] tabuleiro, boolean continuarJogar) {
		
		String resultado = "";
		
		for (int i = -1; i < tabuleiro.length; i++) {
			
			if (i == -1) {
				i = 0;
				
				resultado += "     ";
				for (int j = 0; j < tabuleiro[i].length; j++) {
					resultado += "" + FormatarNumero(j) + " ";
				}
				
				resultado += "\r\n";
				
				resultado += "    ";
				for (int j = 0; j < tabuleiro[i].length; j++) {
					resultado += "---";
				}
				
				resultado += "\r\n";
				
				
			}
			
			resultado += FormatarNumero(i) + " | ";
			
			for (int j = 0; j < tabuleiro[i].length; j++) {
				
				
				if (tabuleiro[i][j] != null && tabuleiro[i][j] != "B") {
					resultado += " " + tabuleiro[i][j] + " ";
				} else {
					if (continuarJogar == false && tabuleiro[i][j] == "B") {
						resultado += " " + tabuleiro[i][j] + " ";
					} else {
						resultado += " X ";
					}
					
				}
			}
			
			resultado += "\r\n";
			
		}
		
		return resultado;
		
	}
	
	public static boolean DesbloquearPosicao(String[][] tabuleiro, int linha, int coluna) {
		
		
		if (tabuleiro[linha][coluna] == "B") {
			return false;
		} else {
			
			int contaBombas = 0;
			
			if (linha > 0 && coluna > 0) {
			
				if (tabuleiro[linha-1][coluna-1] == "B") {
					contaBombas++;
				}
			
			}
			
			if (linha > 0) {
				if (tabuleiro[linha-1][coluna] == "B") {
					contaBombas++;
				}
			}
			
			if (linha > 0 && coluna < tabuleiro[linha].length-1) {
				if (tabuleiro[linha-1][coluna+1] == "B") {
					contaBombas++;
				}	
			}
			
			
			if (coluna > 0) {
				if (tabuleiro[linha][coluna-1] == "B") {
					contaBombas++;
				}
			}
			
			if (coluna < tabuleiro[linha].length-1) {
				if (tabuleiro[linha][coluna+1] == "B") {
					contaBombas++;
				}
			}
			
			if (linha < tabuleiro.length - 1 && coluna > 0) {
				if (tabuleiro[linha+1][coluna-1] == "B") {
					contaBombas++;
				}
			}
			
			if (linha < tabuleiro.length - 1) {
				if (tabuleiro[linha+1][coluna] == "B") {
					contaBombas++;
				}
			}
			
			if (linha < tabuleiro.length - 1 && coluna < tabuleiro[linha].length-1) {
				if (tabuleiro[linha+1][coluna+1] == "B") {
					contaBombas++;
				}
			}
			
			tabuleiro[linha][coluna] = Integer.toString(contaBombas);
			
			return true;
			
		}
		
	}
	
	public static String FormatarNumero(int i) {
		
		if (i+1 <= 9) {
			return "0" + (i+1);
		} else {
			return Integer.toString(i+1);
		}
		
	}

	public static int ContarBombas(String[][] tabuleiro) {
		
		int nrBombas = 0;
		
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] == "B") {
					nrBombas++;
				}
			}
		}
		
		return nrBombas;
		
	}

}
