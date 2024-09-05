package aula04_ForWhile;

import java.util.Scanner;

public class Questao48 {
	
	public static void main(String[] args) {
		
		//entrada de dados
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor de N: ");
		int n = scanner.nextInt();
		//variavel para somar as temperaturas
		double soma = 0;
		
		//lista para salvar as temperaturas lidas
		double [] lista = new double[n];
		
		//percorrendo a lista, adicionando uma temperatura e somando os elementos
		for(int i = 0; i < n; i++) {
			double numero = scanner.nextDouble();
			lista[i] = numero;
			soma = soma + numero;
		}
		
		//calculando a media
		double media = soma/n;
		
		//percorrendo a lista
		for(int i = 0; i < n; i++) {
			//subtraindo a temperatura da lista pela media das temperaturas
			double diferenca = lista[i] - media;
			System.out.printf("%.2f %.2f\n",lista[i],diferenca);
		}
	}

}
