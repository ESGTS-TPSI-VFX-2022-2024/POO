
public class main {

	public static void main(String[] args) {
		 // ETAPA 1: declara��o das vari�veis
		 int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		 
		 int[] v2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		 
		 int[] v3 = new int[9];
		 
		 // ETAPA 2: preenchimento do vetor v3
		 
		 for (int i = 0; i < v3.length; i++) {
			 v3[i] = i % 2 == 0 ? v1[i] : v2[i];
		 }
		 
		 // ETAPA 3: impress�o do vetor v3
		 
		 for (int i = 0; i < v3.length; i++) {
			System.out.println(v3[i]);
		}
	 }

}
