package aula01;

import java.util.Scanner;

public class Questao22 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o coeficiente A: ");
		int a = leitor.nextInt();
		
		System.out.print("Digite o coeficiente B: ");
		int b = leitor.nextInt();
		
		System.out.print("Digite o coeficiente C: ");
		int c = leitor.nextInt();
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		if(delta < 0) {
			System.out.println("sem raizes reais");
		} else if(delta == 0) {
			double x1 = -b/(2*a);
			System.out.println("x1 = "+x1);
		} else {
			double x1 = (-b + Math.sqrt(delta))/(2*a);
			double x2 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
		}
	}

}
