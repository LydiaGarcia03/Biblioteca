import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class CadastroLivro {

	private JFrame frame;
	private JTextField txtTitulo;
	private JTextField txtAutor;
	private JTextField txtEditora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroLivro window = new CadastroLivro();
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
	public CadastroLivro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 500, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Title = new JLabel("Livro");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Title.setBounds(222, 58, 52, 20);
		frame.getContentPane().add(Title);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTitulo.setBounds(88, 99, 46, 14);
		frame.getContentPane().add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTitulo.setBounds(88, 119, 300, 20);
		frame.getContentPane().add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor(a)");
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAutor.setBounds(88, 164, 61, 14);
		frame.getContentPane().add(lblAutor);
		
		txtAutor = new JTextField();
		txtAutor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAutor.setColumns(10);
		txtAutor.setBounds(88, 184, 300, 20);
		frame.getContentPane().add(txtAutor);
		
		JLabel lblGenero = new JLabel("G\u00EAnero");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGenero.setBounds(88, 231, 46, 14);
		frame.getContentPane().add(lblGenero);
		
		JComboBox cmbGenero = new JComboBox();
		cmbGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbGenero.setEditable(true);
		cmbGenero.setBackground(Color.WHITE);
		cmbGenero.setBounds(88, 251, 300, 20);
		frame.getContentPane().add(cmbGenero);
		
		JLabel lblEditora = new JLabel("Editora");
		lblEditora.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEditora.setBounds(88, 302, 46, 14);
		frame.getContentPane().add(lblEditora);
		
		txtEditora = new JTextField();
		txtEditora.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEditora.setColumns(10);
		txtEditora.setBounds(88, 322, 300, 20);
		frame.getContentPane().add(txtEditora);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(Color.BLACK);
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalvar.setBounds(299, 416, 89, 30);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.BLACK);
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVoltar.setBounds(88, 416, 89, 30);
		frame.getContentPane().add(btnVoltar);
	}
}
