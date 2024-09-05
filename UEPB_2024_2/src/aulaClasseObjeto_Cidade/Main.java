package aulaClasseObjeto_Cidade;

public class Main {

	public static void main(String[] args) {
		
		Cidade c1 = new Cidade("Pindamonhagaba", 10000, 32, 89, 200000);
		Cidade c2 = new Cidade("Piracicaba", 15000, 98, 79, 100000);
		
		System.out.println("Nome da cidade 1: "+c1.nome);
		System.out.println("Quantidade de habitantes: "+c1.habitantes);
		System.out.println("Densidade demográfica = "+c1.densidadeDemografica(c1.habitantes, c1.area)+" pessoas/m²");
		
		System.out.println("Distancia entre duas cidades = "+c1.distanciaEntreCidade(c2)+" km");
	}

}
