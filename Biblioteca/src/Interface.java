import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;

public class Interface {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Sistema bibliotec\u00E1rio");
		lblTitle.setFont(new Font("Garamond", Font.PLAIN, 18));
		lblTitle.setBounds(90, 34, 157, 32);
		frame.getContentPane().add(lblTitle);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(115, 108, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnCadastro = new JButton("Cadastre-se");
		btnCadastro.setBounds(104, 153, 111, 23);
		frame.getContentPane().add(btnCadastro);
	}
	
}
