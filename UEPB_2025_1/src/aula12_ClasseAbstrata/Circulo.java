package aula12_ClasseAbstrata;

public class Circulo extends FiguraPlana {
	
	double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public void perimetro() {
		this.perimetro = 2*Math.PI*raio;
	}

	public void area() {
		this.area = Math.PI*Math.pow(raio, 2);
	}
	
	public void calculosGeometricos() {
		perimetro();
		area();
	}
	
	public void exibirInformacoes() {
		System.out.println("Raio do Círculo = "+this.raio);
		System.out.println("Área do Círculo = "+this.area);
		System.out.println("Perímetro do Círculo = "+this.perimetro);
	}
	
	
}
