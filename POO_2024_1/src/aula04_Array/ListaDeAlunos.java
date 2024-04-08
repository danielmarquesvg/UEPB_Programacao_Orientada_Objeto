package aula04_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeAlunos {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		Scanner leitor = new Scanner(System.in);
		
		//adicionar alunos
		System.out.println("Digite a quantidade de alunos a serem inseridos: ");
		int numeroAlunos = leitor.nextInt();		
		
		//adicionando elementos
		for(int i = 0; i < numeroAlunos; i++) {
			System.out.println("Nome do aluno: ");
			String nome = leitor.next();
			lista.add(nome);
		}
		
		//Printando
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("ArrayList["+i+"] = "+lista.get(i));
		}
		
		
		//removendo elementos
		System.out.println("\nRemovendo");
		System.out.println("Digite o índice da remoção: ");
		int indice = leitor.nextInt();
		lista.remove(indice);
		
		//printando
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("ArrayList["+i+"] = "+lista.get(i));
		}
	}

}
