import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class Menu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Garamond", Font.PLAIN, 18));
		lblMenu.setBounds(191, 38, 46, 14);
		frame.getContentPane().add(lblMenu);
		
		JButton btnCadastreUmLivro = new JButton("Cadastre um livro");
		btnCadastreUmLivro.setBackground(Color.LIGHT_GRAY);
		btnCadastreUmLivro.setBounds(145, 93, 130, 23);
		frame.getContentPane().add(btnCadastreUmLivro);
		
		JButton btnPesquise = new JButton("Pesquise");
		btnPesquise.setBackground(Color.LIGHT_GRAY);
		btnPesquise.setBounds(145, 143, 130, 23);
		frame.getContentPane().add(btnPesquise);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(168, 227, 89, 23);
		frame.getContentPane().add(btnLogout);
	}
}
