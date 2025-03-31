package pessoaEndereco;

public class Main {
	
	public static void main(String[] args) {
		
		//Construtor 1
		String nome = "Josefa";
		String rua = "Rua Floriano Peixoto";
		int numero = 3700;
		String complemento = "Casa B";
		String bairro = "Dinamérica";
		
		Pessoa p1 = new Pessoa (nome, rua, numero, complemento, bairro);
		
		System.out.println("Nome = "+p1.nome);
		System.out.println("Rua = "+p1.endereco.rua);
		System.out.println("Número = "+p1.endereco.numero+"\n\n");
		
		//Construtor 2
		String nome1 = "Zé";
		Endereco endereco1 = new Endereco("Avenida Canal",1200,"S/C","Catolé");
		Pessoa p2 = new Pessoa(nome1, endereco1);
		
		System.out.println("Nome = "+p2.nome);
		System.out.println("Rua = "+p2.endereco.rua);
		System.out.println("Número = "+p2.endereco.numero+"\n\n");
		
		//Construtor 3 (vazio)
		Pessoa p3 = new Pessoa();
		p3.nome = "Maria";
		Endereco endereco3 = new Endereco("Avenida Bodocongó",1200,"S/C","Malvinas");
		p3.endereco = endereco3;
		
		System.out.println("Nome = "+p3.nome);
		System.out.println("Rua = "+p3.endereco.rua);
		System.out.println("Número = "+p3.endereco.numero+"\n\n");
		
	}

}
