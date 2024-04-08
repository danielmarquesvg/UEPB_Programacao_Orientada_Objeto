package aula11_herancaSimples;

public class Professor extends Funcionario {
	
	double salario;

	public Professor(String _nome, int _matricula, double _salario) {
		super(_nome, _matricula);
		this.salario = _salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
