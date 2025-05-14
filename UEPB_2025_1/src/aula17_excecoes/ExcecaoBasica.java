package aula17_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoBasica {
	
	public static void main(String[] args) throws ArithmeticException, InputMismatchException, Exception {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Digite o valor de n1: ");
			double n1 = scanner.nextDouble();
			System.out.println("Digite o valor de n2: ");
			double n2 = scanner.nextDouble();
			double resultado = n1 / n2;
			System.out.println("Resultado = "+ resultado);
		} catch(ArithmeticException e) {
			System.out.println("Não pode divisão por zero");
			System.out.println("Pilha de rastreabilidade");
			e.printStackTrace();
		} catch(InputMismatchException e) {
			System.out.println("Os tipos dos números digitados não são double");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("Erro geral");
		} finally {
			scanner.close();
			System.out.println("Fim do programa");
		}
	}
	

}
