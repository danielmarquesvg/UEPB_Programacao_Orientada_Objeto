package aula08_AgregacaoComposicao;

public class Main {
	
	public static void main(String[] args) {
		
		String rua = "Floriano Peixoto";
		int numero = 1000;
		String complemento = "Apartamento 101";
		String bairro = "Centro";
		
		Endereco meuEndereco = new Endereco(rua, numero, complemento, bairro);
		
		String rua1 = "Floriano Peixoto";
		int numero1 = 1000;
		String complemento1 = "Apartamento 101";
		String bairro1 = "Centro";
		
		Endereco meuEndereco1 = new Endereco(rua1, numero1, complemento1, bairro1);
		
		
		String nome = "Z�";
		String cpf = "123.456.789-00";
		
		Pessoa pessoa1 = new Pessoa(nome, cpf, meuEndereco);
		
		String nomeDoProduto = "Camisa";
		double valorDoProduto = 50;
		Produto meuProduto = new Produto(nomeDoProduto, valorDoProduto, pessoa1);
		
		System.out.println("Nome = "+pessoa1.nome);
		System.out.println("CPF = "+pessoa1.cpf);
		System.out.println("Rua = "+pessoa1.endereco.rua);
		System.out.println("N�mero = "+pessoa1.endereco.numero);
		System.out.println("Complemento = "+pessoa1.endereco.complemento);
		System.out.println("Bairro = "+pessoa1.endereco.bairro);
		System.out.println("Produto = "+meuProduto.nome);
		System.out.println("Valor = "+meuProduto.valor);
		System.out.println("Rua da Pessoa = "+meuProduto.pessoa.endereco.rua);
		
	}

}
