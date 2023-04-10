import java.util.Scanner;

public class Questao24 {
	
	public static void main(String[] args) {

		/* Escreva um programa que leia da entrada um valor inteiro e
		 * verifica se o valor recebido representa um ano bissexto ou não.
		 * O resultado da verificação deve ser exibido na saída
		 * do programa da seguinte forma: " não é bissexto" ou
		 *" é bissexto". Veja exemplo de entrada/saída abaixo.
		 * Dica: um ano é bissexto se for divisível por 400
		 * ou se for divisível por 4 e não por 100. 
		 */

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int ano = leitor.nextInt();

		if((ano % 400 == 0) || ((ano % 4 == 0) && !(ano % 100 == 0))){
			System.out.println("O ano "+ano+" é bissexto");
		} else {
			System.out.println("O ano "+ano+" não é bissexto");
		}
		
	}
}
