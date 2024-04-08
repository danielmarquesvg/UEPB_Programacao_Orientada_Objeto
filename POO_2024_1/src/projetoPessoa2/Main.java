package projetoPessoa2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite a sua rua: ");
		String rua = scanner.nextLine();
		
		System.out.println("Digite a sua número: ");
		String numero = scanner.nextLine();
		
		System.out.println("Digite o seu bairro: ");
		String bairro = scanner.nextLine();
		
		Endereco meuEndereco = new Endereco(rua, numero, bairro);
		Pessoa minhaPessoa = new Pessoa(nome, meuEndereco);
		
		System.out.println("=====================");
		System.out.println("Nome = "+minhaPessoa.getNome());
		System.out.println("Rua = "+minhaPessoa.endereco.rua);
		System.out.println("Número = "+minhaPessoa.endereco.numero);
		System.out.println("Bairro = "+minhaPessoa.endereco.bairro);
	}

}
