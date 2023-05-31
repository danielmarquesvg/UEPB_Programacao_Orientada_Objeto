package testeTrocaTelas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import interfaceGrafica.TelaLogin;
import interfaceGrafica.TelaUsuario;

public class Frame extends JFrame {

	static JPanel cards;
	static Panel1 panel1;
	static Panel2 panel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 720);
		cards = new JPanel();
		
		panel1 = new Panel1();
		panel2 = new Panel2();

		cards = new JPanel(new CardLayout()); //variável de instancia
	    cards.add(panel1, "panel1");
	    cards.add(panel2, "panel2");

	    this.getContentPane().add(cards, BorderLayout.CENTER);
	}

}
