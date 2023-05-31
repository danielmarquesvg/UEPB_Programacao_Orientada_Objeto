package Sistema;

public class Cliente {
	
	static long id;
	static String nome;
	static String endereco;
	static long idContaDoUsuario;
	static String senha;
	
	public Cliente(long id, String nome, String endereco, long idContaDoUsuario, String senha){
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.idContaDoUsuario = idContaDoUsuario;
		this.senha = senha;
	}
	
	public Cliente(){
		
	}

	public static long getId() {
		return id;
	}

	public static void setId(int id) {
		Cliente.id = id;
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Cliente.nome = nome;
	}

	public static String getEndereco() {
		return endereco;
	}

	public static void setEndereco(String endereco) {
		Cliente.endereco = endereco;
	}

	
	public static long getIdContaDoUsuario() {
		return idContaDoUsuario;
	}

	public static void setIdContaDoUsuario(int idContaDoUsuario) {
		Cliente.idContaDoUsuario = idContaDoUsuario;
	}

	public static String getSenha() {
		return senha;
	}

	public static void setSenha(String senha) {
		Cliente.senha = senha;
	}
	
	
	
}
