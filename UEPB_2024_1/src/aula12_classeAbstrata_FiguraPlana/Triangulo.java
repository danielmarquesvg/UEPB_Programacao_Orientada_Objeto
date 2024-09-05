package aula12_classeAbstrata_FiguraPlana;

public class Triangulo extends FiguraPlana{
	
	double tamanhoDaBase;
	double altura;
	
	public Triangulo(double tamanhoDaBase, double altura) {
		this.tamanhoDaBase = tamanhoDaBase;
		this.altura = altura;
	}
	
	public double area() {
		area = (tamanhoDaBase * altura) / 2;
		return area;
	}

	public double perimetro() {
		perimetro = tamanhoDaBase * 3;
		return perimetro;
	}
	
	

}
