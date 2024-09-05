package aulaFuncoes;

import java.util.Scanner;

public class Calculadora {
	
	public static double somar(double x, double y) {
		double resultado = x + y;
		return resultado;
	}
	
	public static double subtrair(double x, double y) {
		double resultado = x - y;
		return resultado;
	}
	
	public static int [] dobroDaLista(int [] lista) {
		
		return lista;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("======= Calculadora =======\n");
		System.out.println("Digite um número: ");
		double n1 = scanner.nextDouble();
		System.out.println("Digite um número: ");
		double n2 = scanner.nextDouble();
		
		System.out.println("O resultado da soma é: "+somar(n1, n2));
		
		double resultadoSubtracao = subtrair(n1, n2);
		System.out.println("O resultado da subtração é: "+resultadoSubtracao);
		
		
		
	}

}










