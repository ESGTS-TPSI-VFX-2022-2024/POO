import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] tabuleiro = CriarTabuleiro();
		
		
	}
	
	public static int[][] CriarTabuleiro() {
		
		int[][] tabuleiro = new int[10][10];
		int numeroBombas = 10;
		Random rd = new Random();
		
		for (int i = 0; i < 10; i++) {
			
			int linha = 0;
			int coluna = 0;
			
			do {
				linha = rd.nextInt(1,11);
				coluna = rd.nextInt(1,11);
			} while (tabuleiro[linha][coluna] == -1);
			
			// Colocar bomba
			tabuleiro[linha][coluna] = -1;
			
		}
		
		return tabuleiro;
		
	}

}
