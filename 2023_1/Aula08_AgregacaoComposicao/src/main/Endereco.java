package main;

public class Endereco {
	
	//atributos
	String rua;
	int numero;
	String complemento;
	String bairro;
	
	//Construtor
	public Endereco(String novaRua, int novoNumero, String novoComplemento, String novoBairro) {
		this.rua = novaRua;
		this.numero = novoNumero;
		this.complemento = novoComplemento;
		this.bairro = novoBairro;
	}

}
