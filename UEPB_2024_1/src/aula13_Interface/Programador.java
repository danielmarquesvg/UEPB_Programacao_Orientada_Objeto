package aula13_Interface;

public class Programador implements Funcionario, Contrato {

	String nome;
	double salarioProgramador;
	
	public Programador(String nome, double salarioProgramador) {
		this.nome = nome;
		this.salarioProgramador = salarioProgramador;
	}

	public void getDataInicioContrato() {
		
	}

	public void setDataInicioContrato() {
	
	}

	public void getDataEncerramentoContrato() {
		
	}

	public void setDataEncerramentoContrato() {
		
	}

	public void calcularSalario() {
		this.salarioProgramador = salarioProgramador + salarioBase;
	}

	public String getNome() {
		return this.nome;
	}


	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
}
