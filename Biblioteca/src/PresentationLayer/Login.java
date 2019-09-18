package PresentationLayer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import BusinessLogicLayer.UsuarioBLL;
import DataAccessLayer.Parametros;
import Metadata.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	public JFrame frmLogin;
	private JTextField txtEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transparente t = new Transparente();
					Login window = new Login();
					t.frmTransparente.setVisible(true);
					window.frmLogin.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		JPanel panel = new JPanel();
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setContentPane(panel);
		frmLogin.setUndecorated(true);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.setLocationRelativeTo(null);
		
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0),1, true));
        panel.setBackground(Color.ORANGE);
        panel.setBounds(493, 222, 365, 220);
        
        JLabel label = new JLabel("E-mail:");
        label.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label.setBounds(77, 55, 46, 14);
        panel.add(label);
        
        txtEmail = new JTextField();
        txtEmail.setBorder(new LineBorder(new Color(128, 128, 128), 1, false));
        txtEmail.setBounds(77, 80, 267, 25);
        panel.add(txtEmail);
        
        JLabel label_1 = new JLabel("Senha:");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        label_1.setBounds(77, 116, 46, 14);
        panel.add(label_1);
        
        passwordField = new JPasswordField();
        passwordField.setBorder(new LineBorder(new Color(128, 128, 128), 1, false));
        passwordField.setBounds(77, 141, 267, 25);
        panel.add(passwordField);
        
        JLabel lblCriarConta = new JLabel("Criar conta");
        lblCriarConta.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCriarConta.setBounds(77, 198, 100, 14);
        panel.add(lblCriarConta);
        
      //CONFIGURAÇÕES DO BUTTON LOGIN
        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		
        	   UsuarioBLL ubll = new UsuarioBLL();
               Usuario uLogado = ubll.Autenticar(txtEmail.getText(), passwordField.getPassword().toString());

               if(uLogado != null)
               {
                   if (uLogado.EhFuncionario && uLogado.EhAtivo)
                   {
                       Parametros.UsuarioLogado = uLogado;
                       Transparente frm = new Transparente();
                       frmLogin.setVisible(false);;
                       frm.frmTransparente.setVisible(false);
                   }
                   else if(!uLogado.EhFuncionario && uLogado.EhAtivo)
                   {
                       Parametros.UsuarioLogado = uLogado;
                       Principal frm1 = new Principal();
                       Transparente frm = new Transparente();
                       frmLogin.setVisible(false);
                       frm.frmTransparente.setVisible(false);
                       
                   }
               }
               else
               {
            	   JOptionPane.showMessageDialog(null,"Usuário e/ou senha inválidos");
               }
        	}
        });
        btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnEntrar.setBounds(251, 191, 93, 28);
        btnEntrar.setContentAreaFilled(false);
        btnEntrar.setOpaque(true);
        btnEntrar.setBackground(Color.BLACK);
        btnEntrar.setForeground(Color.WHITE);
        btnEntrar.setBorder(new LineBorder(new Color(0, 0, 0), 1, false));
        panel.add(btnEntrar);
        
       
	}

}
