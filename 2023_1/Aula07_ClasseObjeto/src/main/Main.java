package main;

public class Main {
	
	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("Daniel","Marques",1000.0);
		System.out.println("Nome do empregado 1: "+empregado1.nome);
		System.out.println("Sobrenome do empregado 1: "+empregado1.sobrenome);
		System.out.println("Salario do empregado 1: "+empregado1.salario);
		
		Empregado empregado2 = new Empregado("João","Carlos",2000.0);
		System.out.println("\nNome do empregado 2: "+empregado2.nome);
		System.out.println("Sobrenome do empregado 2: "+empregado2.sobrenome);
		System.out.println("Salario do empregado 2: "+empregado2.salario);
		
		empregado1.aumentoSalario();
		empregado2.aumentoSalario();
		
		System.out.println("\nSalario do empregado 1: "+empregado1.salario);
		System.out.println("Salario do empregado 2: "+empregado2.salario);
		
	}

}
