package aula11_herancaSimples;

public class Main {
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Maria", 1234, 4);
		Professor p1 = new Professor("Daniel", 123456, 3000);
		
		System.out.println("Nome do aluno: "+aluno1.getNome());
		System.out.println("Período do aluno: "+aluno1.getPeriodoDoCurso());
		
		System.out.println("Nome do professor: "+p1.getNome());
		System.out.println("Salário do professor: "+p1.getSalario());
		
	}
	

}
