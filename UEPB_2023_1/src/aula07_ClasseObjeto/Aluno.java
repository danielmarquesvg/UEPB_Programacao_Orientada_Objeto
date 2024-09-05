//pacote
package aula07_ClasseObjeto;

//bibliotecas
import java.lang.Math;

//criando a minha classe
public class Aluno {
	
	//atributos ou caracteristicas
	private static String nome;
	static int matricula;
	static double cre;
	static int periodo;
	static String curso;
	
	//Construtor: serve para construir objetos desta classe
	public Aluno() {
		//this.nome = novoNome;
		//this.matricula = novaMatricula;
	}
	
	//metodos ou funcoes
	protected static void alterarNome(String novoNome) {
		nome = novoNome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	
	
	
	
	
	
	

}
