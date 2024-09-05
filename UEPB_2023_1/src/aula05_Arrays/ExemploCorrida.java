package aula05_Arrays;

import java.util.Scanner;

public class ExemploCorrida {
	
	/*Durante uma corrida de treino de corrida com N voltas 
	 * de dura��o foram anotadas as seguintes informa��es
	 * 1) O n�mero do piloto,
	 * 2) Quantidade de voltas
	 * 3) O melhor tempo
	 * Escreva um programa que mostre o nome do piloto que fez
	 * o melhor tempo, a quantidade voltas e o tempo mais r�pido
	 * da volta mais r�pida
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a quantidade de pilotos");
		int quantidadePilotos = scanner.nextInt();
		
		int idPiloto, numeroVoltas, tempo;
		
		int [][] corrida = new int [quantidadePilotos][3];
		
		for(int i = 0; i < quantidadePilotos; i++) {
			System.out.print("Digite o id do Piloto: ");
			idPiloto = scanner.nextInt();
			System.out.print("Digite a quantidade de voltas: ");
			numeroVoltas = scanner.nextInt();
			System.out.print("Digite o tempo mais r�pido: ");
			tempo = scanner.nextInt();
			
			corrida[i][0] = idPiloto;
			corrida[i][1] = numeroVoltas;
			corrida[i][2] = tempo;
			System.out.println();
		}
		
		int melhorTempo = corrida[0][2];
		int posicao = 0;
		for(int i = 1; i < quantidadePilotos; i++) {
			if(corrida[i][2] < melhorTempo) {
				melhorTempo = corrida[i][2];
				posicao = i;
			}
		}
		
		System.out.println("Id do piloto: "+corrida[posicao][0]);
		System.out.println("Quantidade de voltas: "+corrida[posicao][1]);
		System.out.println("Tempo mais r�pido: "+corrida[posicao][2]);
	}

}
