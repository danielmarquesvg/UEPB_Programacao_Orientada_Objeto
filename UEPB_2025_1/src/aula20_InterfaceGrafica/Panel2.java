package aula20_InterfaceGrafica;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;

public class Panel2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel2() {
		setBounds(0,0,1024,720);
		setLayout(null);
		
		JButton btnNewButton = new JButton("botão");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (Frame.cards.getLayout());
				cl.show(Frame.cards, "panel1");
			}
		});
		btnNewButton.setBounds(315, 219, 89, 23);
		add(btnNewButton);
	}
}
