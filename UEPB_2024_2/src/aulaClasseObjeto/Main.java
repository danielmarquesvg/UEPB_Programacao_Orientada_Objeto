package aulaClasseObjeto;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome da pessoa: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite a idade da pessoa: ");
		int idade = scanner.nextInt();
		
		System.out.println("Gosta de caminhar: ");
		boolean caminhar = scanner.nextBoolean();
		
		//Criando um objeto da classe Pessoa
		Pessoa p1 = new Pessoa(nome, idade, caminhar);
		
		//Modificando um atributo da classe pessoa
		System.out.println("Digite o novo Nome: ");
		String novoNome = scanner.next();
		
		p1.setNome(novoNome);
		
		System.out.println("Verificando o nome: "+p1.getNome());
		
	}

}





