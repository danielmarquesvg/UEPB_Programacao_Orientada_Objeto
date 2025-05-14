package aula12_ClasseAbstrata;

public class Main {
	
	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado(10);
		q1.calculosGeometricos();
		q1.exibirInformacoes();
		
		System.out.println("\n");
		
		Circulo c1 = new Circulo(10);
		c1.calculosGeometricos();
		c1.exibirInformacoes();
		
	}

}
