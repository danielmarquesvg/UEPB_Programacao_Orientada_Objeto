package aula01;

import java.util.Scanner;

public class Questao21 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite um n�mero de conta corrente: ");
		int conta = leitor.nextInt();
		int contaAlterada;
		
		int digito5 = conta % 10;
		contaAlterada = (int)(conta / 10);

		int digito4 = contaAlterada % 10;
		contaAlterada = (int)(contaAlterada / 10);
		
		int digito3 = contaAlterada % 10;
		contaAlterada = (int)(contaAlterada / 10);
		
		int digito2 = contaAlterada % 10;
		contaAlterada = (int)(contaAlterada / 10);
		
		int digito1 = contaAlterada % 10;
		contaAlterada = (int)(contaAlterada / 10);
		
		int soma = digito1 + digito2 + digito3 + digito4 + digito5;
		int verificador = soma % 11;
		
		System.out.println("Conta = "+conta);
		System.out.printf("Conta com digito = "+conta+"-"+verificador);
		
		
	}

}
