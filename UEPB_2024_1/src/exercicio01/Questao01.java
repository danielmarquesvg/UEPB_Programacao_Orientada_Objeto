package exercicio01;

public class Questao01 {
	
	public static void main(String[] args) {
		int a = 2, b = 3, c = 5;

		a = b * 4;
		b = b + a * 3;
		c = c + b + 1;

		int resultado = (a + c) / 2;
		System.out.println(resultado);
	}

}
