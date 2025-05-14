package aula13_interface;

public class DataHorario implements IData, IHorario {

	int dia;
	int mes;
	int ano;
	int segundos;
	int minutos;
	int horas;
	
	public DataHorario(int dia, int mes, int ano, int horas, int minutos, int segundos) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.segundos = segundos;
		this.minutos = minutos;
		this.horas = horas;
	}

	public void mostrarHorarioBrasil() {
		System.out.println("São "+this.horas+"h e "+this.minutos+" no Brasil");
	}

	public void mostrarHorarioUSA() {
		System.out.println("São "+this.horas+"h e "+this.minutos+" no USA");
	}


	public void mostrarDataBrasil() {
		System.out.println("Data: "+this.dia+"/"+this.mes+"/"+this.ano+" no Brasil");
	}


	public void mostrarDataUSA() {
		System.out.println("Data: "+this.mes+"/"+this.dia+"/"+this.ano+" no USA");
	}

}
