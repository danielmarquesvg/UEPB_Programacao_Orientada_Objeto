package aula04_Array;

import java.util.Scanner;

public class ManipulandoArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um tamanho para o array: ");
		int tamanhoDoArray = scanner.nextInt();
		
		//criando meu array
		String [] listaDaFeira = new String[tamanhoDoArray];
		
		// adicionando elementos no array
		for(int i = 0; i < listaDaFeira.length; i++) {
			System.out.println("Digite o elemento "+i+": ");
			String nome = scanner.next();
			listaDaFeira[i] = nome;
		}
		
		// modificar um elemento do array
		System.out.println("MODIFICANDO O ARRAY");
		System.out.println("Digite o índice do array: ");
		int indice = scanner.nextInt();
		
		System.out.println("Digite o novo valor a ser inserido: ");
		String nome = scanner.next(); 
		listaDaFeira[indice] = nome;
		
		for(int i = 0; i < listaDaFeira.length; i++) {
			System.out.println("Lista da Feira ["+i+"] = "+listaDaFeira[i]);
		}
		
		//Removendo elementos
		System.out.println("REMOÇÃO");
		System.out.println("Digite o índice do array: ");
		indice = scanner.nextInt();
		listaDaFeira[indice] = null;
		
		for(int i = 0; i < listaDaFeira.length; i++) {
			System.out.println("Lista da Feira ["+i+"] = "+listaDaFeira[i]);
		}
	}

}













