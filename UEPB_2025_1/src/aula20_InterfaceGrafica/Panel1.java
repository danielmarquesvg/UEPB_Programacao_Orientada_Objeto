package aula20_InterfaceGrafica;

import javax.swing.JPanel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Panel1 extends JPanel {
	private JTextField campoEmail;
	private JPasswordField campoSenha;

	/**
	 * Create the panel.
	 */
	public Panel1() {
		
		setBackground(new Color(30, 144, 255));
		setBounds(0, 0, 1024, 720);
		setLayout(null); //absolute layout
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(100, 149, 237));
		menuBar.setBounds(0, 0, 1024, 36);
		add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salvar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (Frame.cards.getLayout());
				cl.show(Frame.cards, "panel2");
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("fechar");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Editar");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu_1.setForeground(new Color(255, 255, 255));
		menuBar.add(mnNewMenu_1);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		lblNewLabel.setBounds(123, 112, 172, 36);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(123, 212, 77, 25);
		add(lblNewLabel_1);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(179, 212, 467, 25);
		add(campoEmail);
		campoEmail.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(123, 260, 77, 25);
		add(lblNewLabel_1_1);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(179, 260, 467, 26);
		add(campoSenha);
		
		JButton btnNewButton = new JButton("Logar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (Frame.cards.getLayout());
				cl.show(Frame.cards, "panel2");
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		btnNewButton.setBounds(474, 345, 172, 42);
		add(btnNewButton);

	}
}
