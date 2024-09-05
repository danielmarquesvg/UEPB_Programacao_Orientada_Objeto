package aula12ClasseAbstrata;

public class Professor extends Usuario {

	String matricula;
	
	public Professor(String nome, double salario, String matricula) {
		super(nome, salario);
		this.matricula = matricula;
	}
	
	public double calcularSalario() {
		salario = salario + 1000;
		return salario;
	}
	
}
