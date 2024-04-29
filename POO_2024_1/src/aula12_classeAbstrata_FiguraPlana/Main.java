package aula12_classeAbstrata_FiguraPlana;

public class Main {
	
	public static void main (String [] args) {
		
		Quadrado meuQuadrado = new Quadrado(10);
		System.out.println("Área do quadrado = "+meuQuadrado.area());
		System.out.println("Perímetro do quadrado = "+meuQuadrado.perimetro());
		
		Circulo meuCirculo = new Circulo(10);
		System.out.println("\nÁrea do círculo = "+meuCirculo.area());
		System.out.println("Perímetro do círculo = "+ meuCirculo.perimetro());
		
		Triangulo meuTriangulo = new Triangulo(10, 5);
		System.out.println("\nÁrea do triângulo = "+meuTriangulo.area());
		System.out.println("Perímetro do triângulo = "+ meuTriangulo.perimetro());
		
	}

}
