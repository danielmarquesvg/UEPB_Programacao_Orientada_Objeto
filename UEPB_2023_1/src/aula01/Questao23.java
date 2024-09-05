package aula01;

import java.util.Scanner;

public class Questao23 {
	
	public static void main(String[] args) {

	/*Escreva um programa que leia da entrada, inicialmente,
	* o n�mero de gols marcados pelo Campinense e, em seguida,
	* o n�mero de gols marcados pelo Treze num "Cl�ssico dos Maiorais"
	* e que imprima o nome do time vencedor ou a palavra �Empate�,
	* caso o cl�ssico termine empatado */

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite os gols do Campinense: ");
		int golsCampinense = leitor.nextInt();
		System.out.println("Digite os gols do Treze: ");
		int golsTreze = leitor.nextInt();

		if(golsCampinense > golsTreze){
			System.out.println("Campinense");
		} else if (golsTreze > golsCampinense){
			System.out.println("Treze");
		} else {
			System.out.println("Empate");
		}
	}
}