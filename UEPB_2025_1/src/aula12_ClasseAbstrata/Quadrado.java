package aula12_ClasseAbstrata;

public class Quadrado extends FiguraPlana {
	
	int tamanhoDoLado;
	
	public Quadrado(int tamanhoDoLado) {
		this.tamanhoDoLado = tamanhoDoLado;
	}

	public void perimetro() {
		this.perimetro = this.tamanhoDoLado * 4;
	}

	public void area() {
		this.area = this.tamanhoDoLado * this.tamanhoDoLado;
	}
	
	public void calculosGeometricos() {
		perimetro();
		area();
	}
	
	public void exibirInformacoes() {
		System.out.println("Tamanho do lado do quadrado = "+this.tamanhoDoLado);
		System.out.println("Área do quadrado = "+this.area);
		System.out.println("Perímetro do quadrado = "+this.perimetro);
	}

}
