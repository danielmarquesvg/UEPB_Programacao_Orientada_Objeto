package aulaClasseObjeto_Universidade;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Aluno aluno_01 = new Aluno();
		System.out.println("Nome do aluno: "+aluno_01.getNome());
		
		//Entrada de dados
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Digite sua matricula: ");
		int matricula = scanner.nextInt();
		
		System.out.println("Digite seu endereço: ");
		String endereco = scanner.next();
		
		aluno_01.setNome(nome);
		aluno_01.setMatricula(matricula);
		aluno_01.setEndereco(endereco);
		
	}

}
