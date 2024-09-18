package aulaDiagramaDeClasse;

public class Cliente {

	//atributos privados - encapsulamento
	private Carrinho carrinho;
	private String nome;
	private int cpf;

	//Construtor
	public Cliente() {} //construtor vazio
	
	public Cliente(String novoNome, int novoCPF, Carrinho novoCarrinho) {
		this.nome = novoNome;
		this.cpf = novoCPF;
		this.carrinho = novoCarrinho;
	}
	
	//metodos
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

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	
	

}
