package interfaceGrafica;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SplashScreen extends javax.swing.JWindow {
    
	private JLabel jLabelSplashImage;
	
    public SplashScreen() {
        criandoComponentes();
    }

	private void criandoComponentes() {
		/**
		 * Inicializando as variaveis utilizadas
		 */
		jLabelSplashImage = new JLabel();
	       
		/**
		 * Carregando a imagem do Splash e adicionando a imagem ao componente
		 * jLabelSplashImage
		 */
		ImageIcon imageIcon = new ImageIcon(getClass().getResource("lepton_splashScreen.png"));
		jLabelSplashImage.setIcon(imageIcon);
	        
		/**
		 * Definindo dinamicamente o tamando do container segundo o tamanho da imagem.
		 */
		this.setMinimumSize(new java.awt.Dimension(imageIcon.getIconWidth(),imageIcon.getIconHeight()));
		jLabelSplashImage.setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());
	        
		/**
		 * A definicao do layout=null e importante para possibilitar que os componentes
		 * fiquem sobrescritros em tempo de execucao
		 */
		getContentPane().setLayout(null);
	        
		/**
		 * Definindo a localizacao do splash no centro da tela
		 */
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation((screen.width - this.getSize().width) / 2, (screen.height - this.getSize().height) / 2);
	
		/**
		 * O Ultimo item adicionado no conteiner deve ser o componente que contem 
		 * a imagem do Splah
		 */
		this.getContentPane().add(jLabelSplashImage);
		this.pack();
		
	}
	
	public static void centralizarFrame(Container container) {  
	     java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();  
	     int componentWidth = container.getWidth();  
	     int componentHeight = container.getHeight();  
	     container.setBounds((screenSize.width-componentWidth)/2, (screenSize.height-componentHeight)/2, componentWidth, componentHeight);  
	}
   
}
