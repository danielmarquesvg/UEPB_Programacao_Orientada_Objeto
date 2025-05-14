package aula11_herancaSimples;

public class Pessoa {
	
	String nome;
	int cpf;

	public Pessoa(String novoNome, int novoCPF){
		this.nome = novoNome;
		this.cpf = novoCPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
