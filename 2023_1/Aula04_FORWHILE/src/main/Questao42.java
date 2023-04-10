package main;

import java.util.Scanner;

public class Questao42 {
	
public static void main(String[] args) {		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
		
		for(int i = 0; i < nome.length(); i++) {
			if((nome.charAt(i) == 'a') || (nome.charAt(i) == 'A')) {
				contadorA = contadorA + 1;
			}
			
			if((nome.charAt(i) == 'e') || (nome.charAt(i) == 'E')) {
				contadorE = contadorE + 1;
			}
			
			if((nome.charAt(i) == 'i') || (nome.charAt(i) == 'I')) {
				contadorI = contadorI + 1;
			}
			
			if((nome.charAt(i) == 'o') || (nome.charAt(i) == 'O')) {
				contadorO = contadorO + 1;
			}
			
			if((nome.charAt(i) == 'u') || (nome.charAt(i) == 'U')) {
				contadorU = contadorU + 1;
			}
		}
		
		System.out.println("A = "+contadorA);
		System.out.println("E = "+contadorE);
		System.out.println("I = "+contadorI);
		System.out.println("O = "+contadorO);
		System.out.println("U = "+contadorU);
		
	}	

}
