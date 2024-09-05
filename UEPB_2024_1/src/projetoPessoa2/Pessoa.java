package projetoPessoa2;

public class Pessoa {
	
	//Atributos ou características
	private String nome;
	Endereco endereco;
	
	//Construtor de objetos do tipo Pessoa
	public Pessoa(String _novoNome, Endereco _endereco) {
		this.nome = _novoNome;
		this.endereco = _endereco;
	}
	
	//exibir o nome ou retornar o valor do nome
	public String getNome() {
		return this.nome;
	}
	
	//modificar o valor do atributo nome
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

}

