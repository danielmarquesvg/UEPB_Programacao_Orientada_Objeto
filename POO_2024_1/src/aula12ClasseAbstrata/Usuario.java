package aula12ClasseAbstrata;

public abstract class Usuario {
	
	//atributos
	public String nome;
	public double salario;

	public Usuario(String nome, double salario) {
	}
	
	//Metodos
	public abstract double calcularSalario();
	
	
	public String getNome() {
		return this.nome;
	}

}
