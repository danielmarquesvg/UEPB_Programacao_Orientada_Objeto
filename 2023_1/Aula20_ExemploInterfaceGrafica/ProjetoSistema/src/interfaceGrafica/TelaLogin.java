package interfaceGrafica;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

import bancoDeDados.BaseDeDados;
import javax.swing.JSeparator;

public class TelaLogin extends JPanel {
	
	//static BaseDeDados baseDeDados;
	
	public static JPasswordField textField_Senha;
	JButton botaoEntrar;
	public TelaUsuario telaUsuario;
	public static JTextField textField_NumeroDaConta;

	/**
	 * Create the panel.
	 */
	public TelaLogin() {
		
		
		
		setSize(784, 562);
		setLayout(null);
		this.setVisible(true);
		
		/*
		 * Panel Lateral
		 */
		
		JPanel panelLateral = new JPanel();
		panelLateral.setBackground(new Color(51, 51, 51));
		panelLateral.setBounds(0, 0, 145, 600);
		add(panelLateral);
		panelLateral.setLayout(null);
		
		JLabel labelLogin = new JLabel("Login");
		labelLogin.setForeground(new Color(255, 255, 255));
		labelLogin.setFont(new Font("Century Gothic", Font.PLAIN, 36));
		labelLogin.setBounds(21, 27, 102, 52);
		panelLateral.add(labelLogin);
		
		/*
		 * Panel Principal
		 */
		
		//Inicializa��o do panel principal
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setForeground(new Color(255, 255, 255));
		panelPrincipal.setBackground(new Color(204, 204, 204));
		panelPrincipal.setBounds(145, 0, 639, 562);
		add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		//Componentes do panel principal
		JLabel labelConta = new JLabel("Conta");
		labelConta.setForeground(new Color(153, 51, 51));
		labelConta.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		labelConta.setBounds(81, 69, 279, 35);
		panelPrincipal.add(labelConta);
		
		textField_NumeroDaConta = new JTextField();
		textField_NumeroDaConta.setCaretColor(Color.WHITE);
		textField_NumeroDaConta.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField_NumeroDaConta.setForeground(new Color(255, 255, 255));
		textField_NumeroDaConta.setBackground(new Color(51, 51, 51));
		textField_NumeroDaConta.setBounds(81, 104, 425, 35);
		panelPrincipal.add(textField_NumeroDaConta);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setForeground(new Color(153, 51, 51));
		labelSenha.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		labelSenha.setBounds(81, 162, 279, 35);
		panelPrincipal.add(labelSenha);
		
		textField_Senha = new JPasswordField();
		textField_Senha.setCaretColor(Color.WHITE);
		textField_Senha.setForeground(Color.WHITE);
		textField_Senha.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField_Senha.setColumns(10);
		textField_Senha.setBackground(new Color(51, 51, 51));
		textField_Senha.setBounds(81, 196, 425, 35);
		panelPrincipal.add(textField_Senha);
		
		botaoEntrar = new JButton("Entrar");
		botaoEntrar.setForeground(new Color(255, 255, 255));
		botaoEntrar.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		botaoEntrar.setBorder(new EmptyBorder(0, 0, 0, 0));
		botaoEntrar.setBackground(new Color(51, 51, 51));
		botaoEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//boolean test = false;
				boolean test = true;
				//test = TelaPrincipal.baseDeDados.checaUsuario(getTextField_NumeroDaConta(), getTextField_Senha());
				if(test == true){
					CardLayout cl = (CardLayout) (TelaPrincipal.cards.getLayout());
					cl.show(TelaPrincipal.cards, "telaUsuario");
				}
				
			}
		});
		botaoEntrar.setBounds(81, 258, 89, 44);
		panelPrincipal.add(botaoEntrar);
	}

	public static JPasswordField getTextField_Senha() {
		return textField_Senha;
	}

	public static void setTextField_Senha(JPasswordField textField_Senha) {
		TelaLogin.textField_Senha = textField_Senha;
	}

	public static JTextField getTextField_NumeroDaConta() {
		return textField_NumeroDaConta;
	}

	public static void setTextField_NumeroDaConta(JTextField textField_NumeroDaConta) {
		TelaLogin.textField_NumeroDaConta = textField_NumeroDaConta;
	}
	
	
}
