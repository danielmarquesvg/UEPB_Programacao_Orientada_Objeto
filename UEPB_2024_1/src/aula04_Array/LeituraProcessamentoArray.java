package aula04_Array;

import java.util.Scanner;

public class LeituraProcessamentoArray {
	
	// 1 - ler quatro valores
	// 2 - media dos numeros positivos
	// 3 - media dos numeros negativos
	// 4 - soma total de todos os numeros
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//disse a quantidade de números
		System.out.print("Digite a quantidade de números: ");
		int quantidadeNumeros = scanner.nextInt();
		
		//criei um array para armazenar os números
		int [] listaDeNumeros = new int[quantidadeNumeros];
		
		//leitura dos números e colocando dentro do array
		for(int i = 0; i < quantidadeNumeros; i++) {
			System.out.println("\nDigite o "+(i+1)+"º número: ");
			listaDeNumeros[i] = scanner.nextInt();
		}
		
		double mediaPositivos;
		int quantidadePositivos = 0;
		int somaPositivos = 0;
		
		double mediaNegativos;
		int quantidadeNegativos = 0;
		int somaNegativos = 0;
		
		// percorrer o array e realizar os calculos
		for(int i = 0; i < quantidadeNumeros; i++) {
			if(listaDeNumeros[i] < 0) {
				quantidadeNegativos = quantidadeNegativos + 1;
				somaNegativos = somaNegativos + listaDeNumeros[i];			
			} else {
				if (listaDeNumeros[i] > 0) {
					quantidadePositivos = quantidadePositivos + 1;
					somaPositivos = somaPositivos + listaDeNumeros[i];
				}
			}
			
			
		}
		
		//media
		mediaPositivos = somaPositivos / quantidadePositivos;
		mediaNegativos = somaNegativos / quantidadeNegativos;
		int somaTotal = somaNegativos + somaPositivos;
		
		System.out.println("Média dos positivos = "+mediaPositivos);
		System.out.println("Média dos positivos = "+mediaNegativos);
		System.out.println("Soma Total = "+somaTotal);
		
	}

}































