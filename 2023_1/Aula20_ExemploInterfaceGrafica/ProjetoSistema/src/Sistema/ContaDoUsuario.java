package Sistema;

public class ContaDoUsuario {
	
	static long id;
	static double saldoDisponivel;
	static double saldoTotal;
	
	public ContaDoUsuario(long id, double saldoDisponivel, double saldoTotal){
		this.id = id;
		this.saldoDisponivel = saldoDisponivel;
		this.saldoTotal = saldoTotal;
	}
	
	public ContaDoUsuario(){
		
	}

	public static long getId() {
		return id;
	}

	public static void setId(int id) {
		ContaDoUsuario.id = id;
	}

	public static double getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public static void setSaldoDisponivel(double saldoDisponivel) {
		ContaDoUsuario.saldoDisponivel = saldoDisponivel;
	}

	public static double getSaldoTotal() {
		return saldoTotal;
	}

	public static void setSaldoTotal(double saldoTotal) {
		ContaDoUsuario.saldoTotal = saldoTotal;
	}
	
	
	
}
