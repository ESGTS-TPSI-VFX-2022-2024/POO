import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criar um novo tabuleiro
		int[][] tabuleiro = CriarTabuleiro();
		
		// Mostrar o tabuleiro ao utilizador
		System.out.println(MostrarTabuleiro(tabuleiro));
		
	}
	
	//Metodo para criar um novo tabuleiro com bombas aleatórias
	public static int[][] CriarTabuleiro() {
		
		int[][] tabuleiro = new int[10][10];
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
			} while (tabuleiro[linha][coluna] == -1);
			
			// Colocar bomba na posição aleatória
			tabuleiro[linha][coluna] = -1;
			
		}
		
		return tabuleiro;
		
	}
	
	public static String MostrarTabuleiro(int[][] tabuleiro) {
		
		String resultado = "";
		
		for (int i = 0; i < tabuleiro.length; i++) {
			
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] == -1) {
					resultado += "-1 ";
				} else {
					resultado += " 0 ";
				}
			}
			
			resultado += "\r\n";
			
		}
		
		return resultado;
		
	}
	
}
