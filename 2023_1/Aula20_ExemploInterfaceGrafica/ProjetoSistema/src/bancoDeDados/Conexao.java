package bancoDeDados;
import java.sql.*;

public class Conexao {

	public void criarConexao(){
		String driverName = "org.gjt.mm.mysql.Driver";
		String url = "jdbc:mysql://localhost/aula01";
		
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.print("Erro ao registrar o driver");
		}
		
		try {
			Connection con = DriverManager.getConnection(url, "root", "12345");
			Statement stmt = con.createStatement();
			//String createTabCafe = "CREATE TABLE cafe (nome_cafe VARCHAR(32), id_fornecedor INTEGER, preco FLOAT, vendas INTEGER, total INTEGER)";
			//stmt.executeUpdate(createTabCafe);
		} catch (SQLException e){
			e.printStackTrace();
			System.out.print("Erro na conexao");
		}
		
	}
	
	public void inserir(){
		String driverName = "org.gjt.mm.mysql.Driver";
		String url = "jdbc:mysql://localhost/aula01";
		
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.print("Erro ao registrar o driver");
		}
		
		try {
			Connection con = DriverManager.getConnection(url, "root", "admin");
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("INSERT INTO cliente VALUES ('Colombian', 101, 7.99, 0, 0)");
			stmt.executeUpdate("INSERT INTO cafe VALUES ('French_Roast', 49, 8.99, 0, 0)");
			stmt.executeUpdate("INSERT INTO cafe VALUES ('Espresso', 150, 9.99, 0, 0)");
			stmt.executeUpdate("INSERT INTO cafe VALUES ('Colombian_Decaf', 101, 8.99, 0, 0)");
			stmt.executeUpdate("INSERT INTO cafe VALUES ('French_Roast_Decaf', 49, 9.99, 0, 0)");
			
		} catch (SQLException e){
			e.printStackTrace();
			System.out.print("Erro na conexao");
		}
	}
	
	public void criarInserirFornecedor(){
		
		String driverName = "org.gjt.mm.mysql.Driver";
		String url = "jdbc:mysql://localhost/aula01";
	
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.print("Erro ao registrar o driver");
		}
	
		try {
			Connection con = DriverManager.getConnection(url, "root", "12345");
			Statement stmt = con.createStatement();
		
			String createTabFornecedor = "CREATE TABLE fornecedor (id_Fornecedor INTEGER, nome_fornecedor VARCHAR(32), endereco VARCHAR(32), cidade VARCHAR(32), estado VARCHAR(32), cep VARCHAR(32))";
			
			stmt.executeUpdate(createTabFornecedor);
			
			stmt.executeUpdate("INSERT INTO fornecedor VALUES (101, 'Nestlé', 'Av. Floriano Peixoto, 99', 'Campina Grande', 'PB', '58128-087')");
			stmt.executeUpdate("INSERT INTO fornecedor VALUES (49, 'Melita', 'Rua 25 de Março, 123', 'São Paulo', 'SP', '95460-976')");
			stmt.executeUpdate("INSERT INTO fornecedor VALUES (150, 'São Braz', 'Av. Júlio Prestes. 100', 'Curitiba', 'PR', '93966-123')");
			
		} catch (SQLException e){
			e.printStackTrace();
			System.out.print("Erro na conexao");
		}
	
	}
	
}
