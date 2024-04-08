package aula11_herancaSimples;

public class Aluno extends Funcionario {
	
	//atributos
	double cra;

	//Construtor
	public Aluno(String _nome, int _matricula, double _cra) {
		super(_nome, _matricula);
		this.cra = _cra;
	}
	
	//Metodos
	public double getCra() {
		return cra;
	}

	public void setCra(double cra) {
		this.cra = cra;
	}
}
