package interfaceGrafica;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;

public class PanelDadosPessoais extends JPanel {

	private JTextField textField_Nome;
	private JTextField textField_Endereco;
	private JTextField textField_NumeroDaConta;
	private JTextField textField_Senha;
	
	private JButton botaoEditar;
	
	private JTabbedPane tabbedPane;
	private JPanel panel_visualizarEditar;
	private JPanel panel_remover;
	
	/**
	 * Create the panel.
	 */
	public PanelDadosPessoais() {
		
		setSize(639, 562);
		setLayout(null);
		
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(204, 204, 204));
		this.setVisible(true);
		
		/**
		 * JTabbed Pane
		 */
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(23, 24, 595, 527);
		add(tabbedPane);
		
		panel_visualizarEditar = new JPanel();
		tabbedPane.addTab("Visualizar e Editar", null, panel_visualizarEditar, null);
		panel_visualizarEditar.setLayout(null);
		
		panel_remover = new JPanel();
		tabbedPane.addTab("Remover", null, panel_remover, null);
		panel_remover.setLayout(null);
		
		/**
		 * Panel Visualizar e Editar
		 */

		JLabel labelNome = new JLabel("Nome");
		labelNome.setForeground(new Color(153, 51, 51));
		labelNome.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		labelNome.setBounds(84, 41, 279, 35);
		panel_visualizarEditar.add(labelNome);
		
		textField_Nome = new JTextField();
		textField_Nome.setCaretColor(Color.WHITE);
		textField_Nome.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField_Nome.setForeground(new Color(255, 255, 255));
		textField_Nome.setBackground(new Color(51, 51, 51));
		textField_Nome.setBounds(84, 75, 425, 35);
		textField_Nome.setColumns(10);
		panel_visualizarEditar.add(textField_Nome);
		
		JLabel labelEndereco = new JLabel("Endereço");
		labelEndereco.setForeground(new Color(153, 51, 51));
		labelEndereco.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		labelEndereco.setBounds(84, 133, 279, 35);
		panel_visualizarEditar.add(labelEndereco);
		
		textField_Endereco = new JTextField();
		textField_Endereco.setCaretColor(Color.WHITE);
		textField_Endereco.setForeground(Color.WHITE);
		textField_Endereco.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField_Endereco.setColumns(10);
		textField_Endereco.setBackground(new Color(51, 51, 51));
		textField_Endereco.setBounds(84, 167, 425, 35);
		panel_visualizarEditar.add(textField_Endereco);
		
		JLabel labelNumeroDaConta = new JLabel("Número da Conta");
		labelNumeroDaConta.setForeground(new Color(153, 51, 51));
		labelNumeroDaConta.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		labelNumeroDaConta.setBounds(84, 222, 279, 35);
		panel_visualizarEditar.add(labelNumeroDaConta);
		
		textField_NumeroDaConta = new JTextField();
		textField_NumeroDaConta.setCaretColor(Color.WHITE);
		textField_NumeroDaConta.setForeground(Color.WHITE);
		textField_NumeroDaConta.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField_NumeroDaConta.setColumns(10);
		textField_NumeroDaConta.setBackground(new Color(51, 51, 51));
		textField_NumeroDaConta.setBounds(84, 256, 425, 35);
		panel_visualizarEditar.add(textField_NumeroDaConta);
		
		JLabel labelSenha = new JLabel("Senha");
		labelSenha.setForeground(new Color(153, 51, 51));
		labelSenha.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		labelSenha.setBounds(84, 308, 279, 35);
		panel_visualizarEditar.add(labelSenha);
		
		textField_Senha = new JTextField();
		textField_Senha.setCaretColor(Color.WHITE);
		textField_Senha.setForeground(Color.WHITE);
		textField_Senha.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		textField_Senha.setColumns(10);
		textField_Senha.setBackground(new Color(51, 51, 51));
		textField_Senha.setBounds(84, 340, 425, 35);
		panel_visualizarEditar.add(textField_Senha);
		
		botaoEditar = new JButton("Editar Dados");
		botaoEditar.setForeground(new Color(255, 255, 255));
		botaoEditar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		botaoEditar.setBorder(new EmptyBorder(0, 0, 0, 0));
		botaoEditar.setBackground(new Color(51, 51, 51));
		botaoEditar.setBounds(390, 415, 127, 44);
		panel_visualizarEditar.add(botaoEditar);
		
		/**
		 * Panel Remover
		 */
		JLabel labelCancelarContaBancaria = new JLabel("Cancelamento da conta bancária");
		labelCancelarContaBancaria.setForeground(new Color(153, 51, 51));
		labelCancelarContaBancaria.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		labelCancelarContaBancaria.setBounds(53, 41, 262, 35);
		panel_remover.add(labelCancelarContaBancaria);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(new Color(51, 51, 51));
		textPane.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		String stringInformacao = ""
				+"Caro cliente, você deseja cancelar a sua conta no Lepton Bank?";
		textPane.setText(stringInformacao);
		textPane.setBounds(53, 87, 476, 62);
		panel_remover.add(textPane);
		
		JButton botaoCancelarConta = new JButton("Cancelar Conta");
		botaoCancelarConta.setForeground(Color.WHITE);
		botaoCancelarConta.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		botaoCancelarConta.setBorder(new EmptyBorder(0, 0, 0, 0));
		botaoCancelarConta.setBackground(new Color(51, 51, 51));
		botaoCancelarConta.setBounds(53, 186, 127, 44);
		panel_remover.add(botaoCancelarConta);

	}
}
