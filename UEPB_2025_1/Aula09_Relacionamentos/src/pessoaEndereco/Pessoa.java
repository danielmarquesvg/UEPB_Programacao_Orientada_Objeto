package pessoaEndereco;

public class Pessoa {
	
	//atributos
	String nome;
	Endereco endereco;
	
	//Construtor
	public Pessoa(String nome, String rua, int numero, String complemento, String bairro) {
		this.nome = nome;
		Endereco end1 = new Endereco(rua, numero, complemento, bairro);
		this.endereco = end1;
	}
	
	public Pessoa(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Pessoa() {} //Construtor vazio
	
	//metodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
