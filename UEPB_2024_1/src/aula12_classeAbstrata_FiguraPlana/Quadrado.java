package aula12_classeAbstrata_FiguraPlana;

public class Quadrado extends FiguraPlana {

	int tamanhoDoLado;
	
	public Quadrado(int tamanhoDoLado) {
		this.tamanhoDoLado = tamanhoDoLado;
	}
	
	@Override
	public double area() {
		area = tamanhoDoLado * tamanhoDoLado;
		return area;
	}

	@Override
	public double perimetro() {
		perimetro = tamanhoDoLado * 4;
		return perimetro;
	}

}
