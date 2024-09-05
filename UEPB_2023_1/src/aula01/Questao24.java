package aula01;

import java.util.Scanner;

public class Questao24 {
	
	public static void main(String[] args) {

		/* Escreva um programa que leia da entrada um valor inteiro e
		 * verifica se o valor recebido representa um ano bissexto ou n�o.
		 * O resultado da verifica��o deve ser exibido na sa�da
		 * do programa da seguinte forma: " n�o � bissexto" ou
		 *" � bissexto". Veja exemplo de entrada/sa�da abaixo.
		 * Dica: um ano � bissexto se for divis�vel por 400
		 * ou se for divis�vel por 4 e n�o por 100. 
		 */

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int ano = leitor.nextInt();

		if((ano % 400 == 0) || ((ano % 4 == 0) && !(ano % 100 == 0))){
			System.out.println("O ano "+ano+" � bissexto");
		} else {
			System.out.println("O ano "+ano+" n�o � bissexto");
		}
		
	}
}
