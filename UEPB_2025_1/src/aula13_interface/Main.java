package aula13_interface;

public class Main {
	
	public static void main(String[] args) {
		DataHorario utc = new DataHorario(30, 4, 2025, 14, 58, 25);
		utc.mostrarDataBrasil();
		utc.mostrarHorarioBrasil();
		System.out.println("\n");
		utc.mostrarDataUSA();
		utc.mostrarHorarioUSA();
	}

}
