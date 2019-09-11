import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 340, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Title = new JLabel("Menu");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Title.setBounds(140, 43, 56, 23);
		frame.getContentPane().add(Title);
		
		JButton btnCadastro = new JButton("Cadastre um livro");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				CadastroLivro cadastro = new CadastroLivro();
			
			}
		});
		btnCadastro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastro.setBackground(Color.WHITE);
		btnCadastro.setBounds(91, 99, 145, 23);
		frame.getContentPane().add(btnCadastro);
		
		JButton btnPesquisa = new JButton("Pesquise");
		btnPesquisa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPesquisa.setBackground(Color.WHITE);
		btnPesquisa.setBounds(101, 143, 124, 23);
		frame.getContentPane().add(btnPesquisa);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogout.setBounds(122, 208, 89, 23);
		frame.getContentPane().add(btnLogout);
	}
}
