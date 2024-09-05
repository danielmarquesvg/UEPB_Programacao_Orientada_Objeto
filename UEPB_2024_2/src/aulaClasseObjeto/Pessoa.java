package aulaClasseObjeto;

public class Pessoa {
	
	//1 - Atributos
	private String nome;
	int idade;
	boolean gosta_caminhar;
	
	//Construtor
	public Pessoa(String nome, int idade, boolean caminhar) {
		this.nome = nome;
		this.idade = idade;
		this.gosta_caminhar = caminhar;
		
	}
	
	//3 - Métodos
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

}
