package main;

import java.util.Scanner;

public class Questao46 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor para X: ");
		int x = scanner.nextInt();
		
		System.out.println("Digite um valor para Y: ");
		int y = scanner.nextInt();
		
		if(y < x) {
			System.out.println("---");
		} else {
			for(int i = x; i <= y; i++) {
				int quadrado = i*i;
				if(i % 3 == 0) {
					System.out.printf("%d %d *\n",i,quadrado);
				} else {
					System.out.printf("%d %d\n",i,quadrado);
				}
			}
		}	
	}

}
