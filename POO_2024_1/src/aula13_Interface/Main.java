package aula13_Interface;

public class Main {
	
	public static void main(String[] args) {
		
		//Tipo		nomeVariavel
		Programador programador = new Programador("Daniel", 2000);
		System.out.println("Nome do programador = "+programador.nome);
		programador.calcularSalario();
		System.out.println("Salario do programador = "+programador.salarioProgramador);
		
	}

}
