package aula18_gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FramePrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private TelaPrincipal tela = new TelaPrincipal(); //Jpanel
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
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
	public FramePrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(tela);
		setBounds(0, 0, 800, 600);
		tela.setBorder(new EmptyBorder(5, 5, 5, 5));

		tela.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(299, 99, 319, 49);
		tela.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botão pressionado");
				String texto = textField.getText();
				System.out.println("Texto capturado do botão: "+texto);
				
			}
		});
		btnNewButton.setBounds(528, 184, 90, 28);
		tela.add(btnNewButton);
		
	}
}
