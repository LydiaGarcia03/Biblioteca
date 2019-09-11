import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Interface {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblSistemaBibliotecrio = new JLabel("Sistema bibliotec\u00E1rio");
		lblSistemaBibliotecrio.setFont(new Font("Garamond", Font.PLAIN, 18));
		lblSistemaBibliotecrio.setBounds(90, 34, 165, 32);
		frame.getContentPane().add(lblSistemaBibliotecrio);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(115, 108, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnCadastrese = new JButton("Cadastre-se");
		btnCadastrese.setBounds(104, 153, 111, 23);
		frame.getContentPane().add(btnCadastrese);
		
	}
}
