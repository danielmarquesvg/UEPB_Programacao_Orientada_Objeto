package aula11_herancaSimples;

public class Aluno extends Pessoa {
	
	//atributos da classe Pessoa
	int periodoDoCurso;

	public Aluno(String novoNome, int novoCPF, int pCurso) {
		super(novoNome, novoCPF);
		this.periodoDoCurso = pCurso;
	}

	public int getPeriodoDoCurso() {
		return periodoDoCurso;
	}

	public void setPeriodoDoCurso(int periodoDoCurso) {
		this.periodoDoCurso = periodoDoCurso;
	}
	
	public String getNome() {
		return "Meu nome é: "+this.nome;
	}

}
