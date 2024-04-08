package aula11_herancaSimples;

public class Funcionario {
	
	//atributos ou caracteristicas da classe
	private String nome;
	public int matricula;

	//Construtor
	public Funcionario(String _nome, int _matricula) {
		this.nome = _nome;
		this.matricula = _matricula;
	}
	
	//Metodos ou funcoes
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String _nome) {
		this.nome = _nome;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	

}
