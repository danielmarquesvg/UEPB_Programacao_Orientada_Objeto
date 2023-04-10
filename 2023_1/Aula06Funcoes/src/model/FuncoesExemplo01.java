package model;

public class FuncoesExemplo01 {
	
	public static void main(String[] args) {
		
		
		double tempoAntes = System.nanoTime();
		for(int i = 0; i < 1000000; i++) {
			System.out.println(i);
		}
		double tempoDepois = System.nanoTime();
		double tempoNanossegundos = tempoDepois - tempoAntes;
		System.out.printf("Tempo de execução em nanossegundos %.0f",tempoNanossegundos);
		double tempoSegundos = tempoNanossegundos / 1000000000;
		System.out.printf("\nTempo de execução em segundos %.2f",tempoSegundos);
	}

}
