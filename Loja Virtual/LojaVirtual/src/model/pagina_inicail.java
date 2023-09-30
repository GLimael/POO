package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pagina_inicail extends JFrame {
	
	static pagina_inicail frame = new pagina_inicail();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public pagina_inicail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(162, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbLimaDescontos = new JLabel("Lima Descontos");
		lbLimaDescontos.setFont(new Font("Times New Roman", Font.PLAIN, 45));
		lbLimaDescontos.setBounds(255, 107, 291, 53);
		contentPane.add(lbLimaDescontos);
		
		JLabel lbTexot_1 = new JLabel("Bem vindo(a) a Lima Descontos");
		lbTexot_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbTexot_1.setBounds(265, 187, 265, 24);
		contentPane.add(lbTexot_1);
		
		JButton btCadastro = new JButton("Cadastrar");
		btCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina_cadastro cadastro = new pagina_cadastro();
				dispose();
				cadastro.setVisible(true);
			}
		});
		btCadastro.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btCadastro.setBounds(435, 276, 116, 24);
		contentPane.add(btCadastro);
		
		JLabel lblTexto_2 = new JLabel("Aqui você compra e anuncia quaisquer produtos");
		lblTexto_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTexto_2.setBounds(202, 222, 382, 24);
		contentPane.add(lblTexto_2);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina_login login = new pagina_login();
				dispose();
				login.setVisible(true);
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnLogin.setBounds(242, 276, 116, 24);
		contentPane.add(btnLogin);
	}
}
