package interfaceGrafica;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class PanelContaBancaria extends JPanel {

	public PanelContaBancaria() {
		
		setSize(639, 562);
		setLayout(null);
		this.setVisible(true);
		
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(204, 204, 204));
		
		//Panel Saque
		JPanel panel_Saque = new JPanel();
		panel_Saque.setBounds(28, 36, 269, 302);
		add(panel_Saque);
		panel_Saque.setLayout(null);
		
		JLabel label_Saque = new JLabel("Saque");
		label_Saque.setForeground(new Color(153, 51, 51));
		label_Saque.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_Saque.setBounds(10, 11, 53, 35);
		panel_Saque.add(label_Saque);
		
		JLabel label = new JLabel("Valor do saque:");
		label.setForeground(new Color(51, 51, 51));
		label.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label.setBounds(10, 52, 116, 35);
		panel_Saque.add(label);
		
		JTextField textField_ValorSaque = new JTextField();
		textField_ValorSaque.setCaretColor(Color.WHITE);
		textField_ValorSaque.setForeground(Color.WHITE);
		textField_ValorSaque.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField_ValorSaque.setBackground(new Color(51, 51, 51));
		textField_ValorSaque.setBounds(125, 55, 117, 27);
		panel_Saque.add(textField_ValorSaque);
		
		JButton botaoSaque = new JButton("Sacar");
		botaoSaque.setForeground(Color.WHITE);
		botaoSaque.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		botaoSaque.setBorder(new EmptyBorder(0, 0, 0, 0));
		botaoSaque.setBackground(new Color(51, 51, 51));
		botaoSaque.setBounds(153, 125, 89, 44);
		panel_Saque.add(botaoSaque);
		
		//Panel Visualizar Conta Bancaria
		JPanel panel_ContaBancaria = new JPanel();
		panel_ContaBancaria.setLayout(null);
		panel_ContaBancaria.setBounds(28, 349, 269, 183);
		add(panel_ContaBancaria);
		
		JLabel label_ContaBancaria = new JLabel("Visualizar Saldo");
		label_ContaBancaria.setForeground(new Color(153, 51, 51));
		label_ContaBancaria.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_ContaBancaria.setBounds(10, 11, 111, 35);
		panel_ContaBancaria.add(label_ContaBancaria);
		
		JLabel label_SaldoTotal = new JLabel("Saldo Total:");
		label_SaldoTotal.setForeground(new Color(51, 51, 51));
		label_SaldoTotal.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_SaldoTotal.setBounds(10, 50, 85, 27);
		panel_ContaBancaria.add(label_SaldoTotal);
		
		JLabel label_SaldoDisponivel = new JLabel("Saldo Disponível:");
		label_SaldoDisponivel.setForeground(new Color(51, 51, 51));
		label_SaldoDisponivel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_SaldoDisponivel.setBounds(10, 88, 124, 27);
		panel_ContaBancaria.add(label_SaldoDisponivel);
		
		//TelaPrincipal.baseDeDados.checaSaldo();
		//double saldo = TelaPrincipal.baseDeDados.getSaldototal();
		//String str = new Double(saldo).toString();
		String str = "20.00";
		JTextField textField_SaldoTotal = new JTextField(str);
		textField_SaldoTotal.setCaretColor(Color.WHITE);
		textField_SaldoTotal.setForeground(Color.WHITE);
		textField_SaldoTotal.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField_SaldoTotal.setBackground(new Color(51, 51, 51));
		textField_SaldoTotal.setBounds(131, 50, 117, 27);
		panel_ContaBancaria.add(textField_SaldoTotal);
		
		JTextField textField_SaldoDisponivel = new JTextField();
		textField_SaldoDisponivel.setCaretColor(Color.WHITE);
		textField_SaldoDisponivel.setForeground(Color.WHITE);
		textField_SaldoDisponivel.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField_SaldoDisponivel.setBackground(new Color(51, 51, 51));
		textField_SaldoDisponivel.setBounds(131, 86, 117, 27);
		panel_ContaBancaria.add(textField_SaldoDisponivel);
		
		//Panel Deposito
		JPanel panel_Deposito = new JPanel();
		panel_Deposito.setBounds(324, 36, 269, 302);
		add(panel_Deposito);
		panel_Deposito.setLayout(null);
		
		JLabel label_Deposito = new JLabel("Depósito");
		label_Deposito.setForeground(new Color(153, 51, 51));
		label_Deposito.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_Deposito.setBounds(10, 11, 76, 35);
		panel_Deposito.add(label_Deposito);
		
		JLabel label_valorDeposito = new JLabel("Valor do depósito:");
		label_valorDeposito.setForeground(new Color(51, 51, 51));
		label_valorDeposito.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label_valorDeposito.setBounds(10, 52, 132, 35);
		panel_Deposito.add(label_valorDeposito);
		
		JTextField textField_ValorDeposito = new JTextField();
		textField_ValorDeposito.setCaretColor(Color.WHITE);
		textField_ValorDeposito.setForeground(Color.WHITE);
		textField_ValorDeposito.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		textField_ValorDeposito.setBackground(new Color(51, 51, 51));
		textField_ValorDeposito.setBounds(142, 55, 117, 27);
		panel_Deposito.add(textField_ValorDeposito);
		
		JButton botaoDeposito = new JButton("Depositar");
		botaoDeposito.setForeground(Color.WHITE);
		botaoDeposito.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		botaoDeposito.setBorder(new EmptyBorder(0, 0, 0, 0));
		botaoDeposito.setBackground(new Color(51, 51, 51));
		botaoDeposito.setBounds(170, 123, 89, 44);
		panel_Deposito.add(botaoDeposito);

	}
}
