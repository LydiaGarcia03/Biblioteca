package PresentationLayer;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Bibliotecario {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bibliotecario window = new Bibliotecario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Bibliotecario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*barraDeMenu = criaMenu();
	      this.setJMenuBar(barraDeMenu);

	      desktop = new JDesktopPane();
	      this.setContentPane(desktop);
	      this.setVisible(true);*/
	}

}
