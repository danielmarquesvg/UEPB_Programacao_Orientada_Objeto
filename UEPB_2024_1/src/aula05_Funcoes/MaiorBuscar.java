package aula05_Funcoes;

public class MaiorBuscar {
	
	public static void main(String[] args) {
		
		double [] lista = {1, 2, 4, 5, 6, 7};
		double procurado = 11;
		
		double maior = maiorNumero(lista);
		boolean achou = buscar(lista, 4);
		
		System.out.println("O maior número é: "+maior);
		System.out.println("Achou ou não: "+achou);
		
	}
	
	public static double maiorNumero(double [] lista) {
		double maior = lista[0];
		for(int i = 1; i < lista.length; i++) {
			if(lista[i] > maior) {
				maior = lista[i];
			}
		}
		return maior;
	}
	
	public static boolean buscar(double [] lista, double procurado) {
		boolean achou = false;
		int i = 0;
		while((i < lista.length) && (achou == false)) {
			if(lista[i] == procurado) {
				achou = true;
			}
			
			i = i+1;
		}
		return achou;
	}

}
