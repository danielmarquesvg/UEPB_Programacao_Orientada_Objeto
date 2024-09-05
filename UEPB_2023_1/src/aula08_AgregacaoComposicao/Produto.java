package aula08_AgregacaoComposicao;

public class Produto {
	
	//atributos
	String nome;
	double valor;
	Pessoa pessoa;
	
	//construtor
	public Produto(String novoNome, double novoValor, Pessoa novaPessoa) {
		this.nome = novoNome;
		this.valor = novoValor;
		this.pessoa = novaPessoa;
	}

}
