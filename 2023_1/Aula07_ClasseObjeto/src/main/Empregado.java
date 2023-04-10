package main;

public class Empregado {
	
	String nome;
	String sobrenome;
	double salario;
	
	public Empregado(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	public void aumentoSalario() {
		this.salario = this.salario + (this.salario*0.1);
	}

}
