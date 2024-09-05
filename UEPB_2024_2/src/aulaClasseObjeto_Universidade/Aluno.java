package aulaClasseObjeto_Universidade;

public class Aluno {
	
	//atributos
	private String nome;
	int matricula;
	String endereco;
	
	//Construtor
	public Aluno(String novoNome, int novaMatricula, String novoEndereco) {
		this.nome = novoNome;
		this.matricula = novaMatricula;
		this.endereco = novoEndereco;
	}
	
	public Aluno() {}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
