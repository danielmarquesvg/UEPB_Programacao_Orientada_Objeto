package aula02_estrutura_condicao;

import java.util.Scanner;

public class Exemplo_Par_100 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0){
			if(numero >= 100) {
				System.out.println("O número é par e maior ou igual a 100");
			} else {
				System.out.println("O número é par e menor que 100");
			}
		} else {
			if(numero >= 100) {
				System.out.println("O número é ímpar e maior ou igual a 100");
			} else {
				System.out.println("O número é ímpar e menor que 100");
			}
		}
		
	}

}
