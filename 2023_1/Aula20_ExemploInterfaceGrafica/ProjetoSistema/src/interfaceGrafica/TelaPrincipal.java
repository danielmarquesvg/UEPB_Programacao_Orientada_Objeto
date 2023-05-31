package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bancoDeDados.BaseDeDados;

public class TelaPrincipal extends JFrame {
	
	static JPanel cards;
	static TelaLogin telaLogin;
	static TelaUsuario telaUsuario;
	//static BaseDeDados baseDeDados = new BaseDeDados();
	

	public static void main(String args[]) {
	       
		SplashScreen splashScreen = new SplashScreen();
		splashScreen.setVisible(true);
		
		/**
		 * Dura��o da Splash Screen na tela
		 * 1000 milisegundos = 1 segundo
		 */
		try{
			Thread.sleep(2000);
		}catch(Exception e){
	                        
		}
		
		/**
		 * Fechar a Splash Screen
		 */
		splashScreen.dispose();
		
		/**
		 * Abrir o aplicativo
		 */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
	    		try {
	    			/**
	    			 * Instanciacao e inicializacao do JFrame
	    			 */
	    			TelaPrincipal telaPrincipal = new TelaPrincipal();
	    			
	    			/**
	    			 * Centralizacao do frame na tela
	    			 */
	    			SplashScreen.centralizarFrame(telaPrincipal);
	    			
	    			telaPrincipal.setVisible(true);
	    			
	    		} catch (Exception e) {
	    			e.printStackTrace();
	    		}
	    	}
	    });
	          
	}
	/**
	 * Create the frame.
	 */
	public TelaPrincipal() { 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		//getContentPane().setLayout(null);
		
		telaLogin = new TelaLogin();
		telaUsuario = new TelaUsuario();
		
		cards = new JPanel(new CardLayout()); //variável de instancia
	    cards.add(telaLogin, "telaLogin");
	    cards.add(telaUsuario, "telaUsuario");

	    this.getContentPane().add(cards, BorderLayout.CENTER);
	}
	
	
}
