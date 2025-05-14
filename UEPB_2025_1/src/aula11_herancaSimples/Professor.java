package aula11_herancaSimples;

public class Professor extends Pessoa{
	
	double salario;

	public Professor(String novoNome, int novoCPF, double salario) {
		super(novoNome, novoCPF);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/*
	public String getNome() {
		return "O nome do docente é: "+this.nome;
	}*/

}
