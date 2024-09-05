package aula03_repeticao;

import java.util.Scanner;

public class PararCondicaoZero {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = -1, soma = 0;
		while(numero != 0) {
			System.out.print("Por favor, digite um número: ");
			numero = scanner.nextInt();
			
			soma = soma + numero;
			System.out.println("A soma parcial é: "+soma+"\n");
		}
		
		System.out.println("A soma final é: "+soma);
		
	}

}
