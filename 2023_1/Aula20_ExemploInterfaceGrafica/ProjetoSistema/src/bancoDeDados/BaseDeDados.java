package bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import Sistema.Cliente;
import Sistema.ContaDoUsuario;

public class BaseDeDados {
	
	String url = "jdbc:postgresql://localhost:5432/";
	String driver = "org.postgresql.Driver";
	String userDoBanco = "postgres";
	String senhaDoBanco = "admin";
	String nomeDoBanco = "cxeletronico";
	
	public Statement stm;
	public Connection con;
	
	String cmdSelect = "select * from cliente order by id";
	String contaSelect = "select * from conta order by id";
	public ResultSet rs;
	
	Cliente cliente;
	List<Cliente> listaClientes = new ArrayList<Cliente>();
	List<ContaDoUsuario> listaContas = new ArrayList<ContaDoUsuario>();
	
	JTextField login;
	JPasswordField senha;
	String log;
	String sen;
	ContaDoUsuario contaDoUsuario;
	
	public BaseDeDados() {
		try {
			cliente = new Cliente();
			contaDoUsuario = new ContaDoUsuario();
			con = conectaAoBanco ();
			stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);			
			atualizaListas();					
			for (int i = 0; i < listaClientes.size(); i++) {
				cliente = listaClientes.get(i);
				System.out.printf("%d %s %s %d", cliente.getId(), cliente.getNome(), 
						cliente.getEndereco(), cliente.getIdContaDoUsuario());
				System.out.println();
			}			
			for (int i = 0; i < listaContas.size(); i++) {
				contaDoUsuario = listaContas.get(i);
				System.out.printf("%d %2.2f %2.2f", contaDoUsuario.getId(), contaDoUsuario.getSaldoDisponivel(), 
						contaDoUsuario.getSaldoTotal());
				System.out.println();
			}			
		} catch(Exception e) {
			System.out.println("Error: Falha na conex�o!");
		}
	}
	
	public void atualizaListas() {
		try {
			rs = stm.executeQuery(cmdSelect);
			rs.last();
			int tam = rs.getRow(); //n�mero de linhas da tabela
			rs.first();
			for (int i = 0; i < tam; i++) {
				listaClientes.add(new Cliente(
					rs.getLong(1),   //id
					rs.getString(2), //nome
					rs.getString(3), //endere�o
					rs.getLong(4), //id da conta
					rs.getString(5))); //senha				
				rs.next();
			}
			//rs.first();
			for (int i = 0; i < 2; i++) {
				System.out.println("-------------------");
				System.out.println(listaClientes.get(i).getId());
				//System.out.println(""+listaClientes.getLong(1));
				//System.out.println(""+rs.getString(2));
				System.out.println("-------------------");
				//rs.next();
			}
			
			rs = stm.executeQuery(contaSelect);
			rs.last();
			int tamConta = rs.getRow(); //n�mero de linhas da tabela
			rs.first();
			for (int i = 0; i < tamConta; i++) {
				listaContas.add(new ContaDoUsuario(
					rs.getLong(1),   //id
					rs.getDouble(2), //saldoDispon�vel
					rs.getDouble(3))); //saldoTotal			
				rs.next();
			}
		} catch (Exception e) {
			System.out.println("Error: Falha na conexão!");
		}
	}
	
	private long idCliente;
	public long getIdCliente() {
		return idCliente;
	}
	
	private long numConta;
	public long getNumConta() {
		return numConta;
	}
	
	public boolean checaUsuario(JTextField login, JPasswordField senha) {
		log = login.getText();
		sen = convertPassword(senha);
		for (int i = 0; i < listaClientes.size(); i++) {
			cliente = listaClientes.get(i);
			if (cliente.getNome().equals(log) && cliente.getSenha().equals(sen)) {
				idCliente = cliente.getId();
				numConta = cliente.getIdContaDoUsuario();
				checaSaldo(); //idCliente);
				return true;
			}
		}
		return false;
	}
	
	private double saldodisp = 0;
	public double getSaldodisp() {
		return saldodisp;
	}
	
	public void setSaldodisp(double saldodisp) {
		this.saldodisp = saldodisp;
	}
	
	private double saldototal = 0;
	public double getSaldototal() {
		return saldototal;
	}

	public void setSaldototal(double saldototal) {
		this.saldototal = saldototal;
	}
	
	public void checaSaldo() { //long idCliente) {
		ContaDoUsuario c;
		for (int i = 0; i < listaContas.size(); i++) {
			c = listaContas.get(i);
			if (numConta == c.getId()) {
				saldodisp = c.getSaldoDisponivel();
				saldototal = c.getSaldoTotal();
			}
		}
	}
	
    private String convertPassword(JPasswordField senha) {
        String passwd = "";
        char[] pas = senha.getPassword();
        for (int i = 0; i < pas.length; i++) {
        	passwd += pas[i];
        }
        return passwd;
    }
	Connection conectaAoBanco () {
		try {
            Class.forName(driver);
        } catch(java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }
		try {
			url += nomeDoBanco;
			con = DriverManager.getConnection(url, userDoBanco, senhaDoBanco);			
		} catch(SQLException ex) {
            System.err.print("SQLException: ");
            System.err.println(ex.getMessage());
        }
		return con;
	}
	void fechaConexao() {
		try {
			stm.close();
			con.close();
		} catch(SQLException ex) {
            System.err.print("SQLException: ");
            System.err.println(ex.getMessage());
        }
	}

/*	private Conta getContas(int numContaCorrente) {
		for (Conta contaCorrenteAtual : contas) {
			if (contaCorrenteAtual.getNumeroDaConta() == numContaCorrente)
				return contaCorrenteAtual;
		}
		return null;
	}

	public boolean authenticateUser(int numContaCorrente, int userPIN) {
		Conta conta = getContas(numContaCorrente);
		if (conta != null)
			return conta.validatePIN(userPIN);
		else
			return false;
	}

	public double getSaldoValido(int numContaCorrente) {
		return getContas(numContaCorrente).getSaldoValido();
	}

	public double getSaldoTotal(int numContaCorrente) {
		return getContas(numContaCorrente).getSaldoTotal();
	}

	public void credit(int numContaCorrente, double valor) {
		getContas(numContaCorrente).credito(valor);
	}

	public void debit(int numContaCorrente, double valor) {
		getContas(numContaCorrente).debito(valor);
	}*/
}