package bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conectarLeptonBank {
	
	static String url = "jdbc:postgresql://localhost:5432/LeptonBank";
	static String driver = "org.postgresql.Driver";
	static String userDoBanco = "postgres";
	static String senhaDoBanco = "admin";
	
	public Statement stm;
	public Connection con;
	
	public static void criarConexao(){
		try {
			Class.forName(driver);
			System.out.println("1 OK");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.print("Erro ao registrar o driver");
		}
		
		try {
			Connection con = DriverManager.getConnection(url, userDoBanco, senhaDoBanco);
			Statement stmt = con.createStatement();
			System.out.println("2 OK");
		} catch (SQLException e){
			e.printStackTrace();
			System.out.print("Erro na conexao");
		}
	}
	
	public static void main(String[] args) throws SQLException {
        criarConexao();
    }

}
