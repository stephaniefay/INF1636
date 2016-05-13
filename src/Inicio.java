package Inicial;



import javax.swing.*;

@SuppressWarnings("serial")
public class Inicio extends JFrame{
	public final int WIDTH = 514;
	public final int HEIGHT = 439;
	
	
	public Inicio () {
		ImageIcon img = new ImageIcon("Icon.png");
		this.setSize(WIDTH, HEIGHT);

		this.setLocationRelativeTo(null);
		setTitle("WAR");
		this.setIconImage(img.getImage());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		
		drawBack m = new drawBack();
		getContentPane().add(m);	
		this.setVisible(true);
	}
	
}
