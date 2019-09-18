package PresentationLayer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Transparente {

	public JFrame frmTransparente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transparente window = new Transparente();
					window.frmTransparente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Transparente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTransparente = new JFrame();
		frmTransparente.getContentPane().setBackground(Color.BLACK);
		frmTransparente.getContentPane().setLayout(null);
		
		Dimension di = Toolkit.getDefaultToolkit().getScreenSize();
		
		frmTransparente.setMaximumSize(di);
		frmTransparente.setMinimumSize(di);
		frmTransparente.setUndecorated(true);
		frmTransparente.setBackground(Color.BLACK);
		frmTransparente.setForeground(Color.BLACK);
		frmTransparente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmTransparente.setResizable(false);
        frmTransparente.setVisible(true);
        frmTransparente.setOpacity(0.6f);
        frmTransparente.requestFocus();
	}

}
