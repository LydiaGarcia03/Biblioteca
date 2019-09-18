package PresentationLayer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Insets;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;

public class Principal {

	private JFrame frmHome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();		
					window.frmHome.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmHome = new JFrame();
		JPanel panel = new JPanel();
		
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		frmHome.setContentPane(panel);
        frmHome.pack();
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.getContentPane().setBackground(Color.WHITE);
		panel.setLayout(null);
		frmHome.setMaximumSize(di);
		frmHome.setMinimumSize(di);
		frmHome.setResizable(false);
		
		
		frmHome.setVisible(true);
		
		/*barraDeMenu = criaMenu();
	      this.setJMenuBar(barraDeMenu);

	      desktop = new JDesktopPane();
	      this.setContentPane(desktop);
	      this.setVisible(true);*/
    
	}
}
