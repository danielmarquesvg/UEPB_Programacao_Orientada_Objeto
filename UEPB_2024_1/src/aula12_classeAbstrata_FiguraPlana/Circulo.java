package aula12_classeAbstrata_FiguraPlana;

public class Circulo extends FiguraPlana {
	
	int raio;
	
	public Circulo(int raio) {
		this.raio = raio;
	}

	public double area() {
		area = 3.14 * raio * raio;
		return area;
	}
	
	public double perimetro() {
		perimetro = 2 * 3.14 * raio;
		return perimetro;
	}
	
	

}
