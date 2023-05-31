package interfaceGrafica;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class TelaUsuario extends JPanel {
	
	static JPanel panelPrincipal;
	static JPanel cards;
	
	static PanelContaBancaria panelContaBancaria;
	static PanelDadosPessoais panelDadosPessoais;

	/**
	 * Create the panel.
	 */
	public TelaUsuario() {
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
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(145, 0, 639, 562);
		add(panelPrincipal);
		panelPrincipal.setLayout(new CardLayout(0, 0));
		
		panelDadosPessoais = new PanelDadosPessoais();
		panelContaBancaria = new PanelContaBancaria();		
		
		cards = new JPanel(new CardLayout());
	    cards.add(panelContaBancaria, "panelContaBancaria");
	    cards.add(panelDadosPessoais, "panelDadosPessoais");
	    
	    panelPrincipal.add(cards, BorderLayout.CENTER);
		
		JLabel labelUsuario = new JLabel("Usuário");
		labelUsuario.setForeground(new Color(255, 255, 255));
		labelUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 36));
		labelUsuario.setBounds(10, 31, 135, 52);
		panelLateral.add(labelUsuario);
		
		final JButton botaoContaBancaria = new JButton("Conta Bancária");
		final JButton botaoDadosPessoais = new JButton("Dados Pessoais");
		
		botaoContaBancaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cl = (CardLayout) (cards.getLayout());
				cl.show(cards, "panelContaBancaria");
				botaoContaBancaria.setBackground(new Color(204, 204, 204));
				botaoDadosPessoais.setBackground(new Color(51, 51, 51));
				
				
			}
		});
		botaoContaBancaria.setForeground(Color.WHITE);
		botaoContaBancaria.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		botaoContaBancaria.setBorder(new LineBorder(new Color(204, 204, 204)));
		botaoContaBancaria.setBackground(new Color(204, 204, 204));
		botaoContaBancaria.setBounds(0, 157, 145, 36);
		panelLateral.add(botaoContaBancaria);
		
		
		botaoDadosPessoais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cl = (CardLayout) (cards.getLayout());
				cl.show(cards, "panelDadosPessoais");
				botaoContaBancaria.setBackground(new Color(51, 51, 51));
				botaoDadosPessoais.setBackground(new Color(204, 204, 204));
				
			}
		});
		botaoDadosPessoais.setForeground(new Color(255, 255, 255));
		botaoDadosPessoais.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		botaoDadosPessoais.setBorder(new LineBorder(new Color(204, 204, 204)));
		botaoDadosPessoais.setBackground(new Color(51, 51, 51));
		botaoDadosPessoais.setBounds(0, 207, 145, 36);
		panelLateral.add(botaoDadosPessoais);
		
		

	}
}
