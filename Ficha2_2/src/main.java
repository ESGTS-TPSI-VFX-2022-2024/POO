
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Rectangulo r1 = new Rectangulo(15);
		//Rectangulo r2 = new Rectangulo();
		
		//r1.setLado(15);
		
		//System.out.println(r1.getArea());
		
		//r1.CalcularArea();
		
		//System.out.println(r1.getArea());
		
		//System.out.println(r2.getLado());
		
		//r1.lado = 10;
		//r1.perimetro = 110;
		
		Circulo c1 = new Circulo();
		Circulo c2 = c1;
		Circulo c3 = new Circulo();
		
		
		c1.setRaio(10);
		c1.CalcularArea();
		c1.CalcularPerimetro();
		
		//System.out.println(c1.getPerimetro());
		//System.out.println(c1.getArea());
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3); 
		
	}

}
