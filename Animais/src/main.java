import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a1 = new Animal(10, "Azul");
		Cao c1 = new Cao(10, "Azul", "Normal");
		//System.out.println(a1.EmitirSom());
		//System.out.println(c1.EmitirSom());
		
		Animal a2 = new Cao(20, "Vermelho", "Normal");
		//System.out.println(a2.EmitirSom());
		
		if (a2 instanceof Cao) {
			System.out.println(((Cao)a2).getRaca());
		}
		
		//System.out.println(a2.getRaca());
		
		Animal a3 = new Gato(20, "Vermelho", "Escuro");
		//System.out.println(a3.EmitirSom());
		
		Girafa g1 = new Girafa(10, "Amarela", 100);
		
		ArrayList<Animal> animais = new ArrayList<Animal>();
		animais.add(a1);
		animais.add(a2);
		animais.add(c1);
		animais.add(a3);
		animais.add(g1);
		
		for (Animal animal : animais) {
			//System.out.println(animal.EmitirSom());
		}
		
		int contaCaes = 0;
		for (Animal animal : animais) {
			if (animal instanceof Cao) {
				contaCaes++;
			}
		}
		
		//System.out.println("Existem " + contaCaes + " cães.");
			
		
	}

}
