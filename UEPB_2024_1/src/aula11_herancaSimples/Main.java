package aula11_herancaSimples;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite sua matricula: ");
		int matricula = scanner.nextInt();
		
		System.out.println("Qual a sua categoria: ");
		System.out.println("1 - Aluno");
		System.out.println("2 - Professor");
		System.out.println("3 - Outro");
		String escolha = scanner.next();
		
		if(escolha.equals("1")) {
			System.out.println("Digite seu CRA: ");
			double cra = scanner.nextDouble();
			Aluno aluno = new Aluno(nome, matricula, cra);
			
			System.out.println("Nome do aluno: "+aluno.getNome());
			System.out.println("Matricula do aluno: "+aluno.getMatricula());
			System.out.println("CRA do aluno: "+aluno.getCra());
		} else {
			if(escolha == "2") {
				System.out.println("Digite seu salario: ");
				double salario = scanner.nextDouble();
				Professor professor = new Professor(nome, matricula, salario);
				
				System.out.println("Nome do professor: "+professor.getNome());
				System.out.println("Matricula do professor: "+professor.getMatricula());
				System.out.println("Salario do professor: "+professor.getSalario());
			} else {
				Funcionario funcionario = new Funcionario(nome, matricula);
				System.out.println("Nome do funcionario: "+funcionario.getNome());
				System.out.println("Matricula do funcionario: "+funcionario.getMatricula());
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
