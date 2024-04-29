package aula13_Interface;

public interface Funcionario {
	
	//não é uma variável
	//é uma constante
	public static final double salarioBase = 2500;
	
	//metodos são abstratos,
	//mas não precisa do abstract
	public String getNome();
	public void setNome(String nome);
	

}
