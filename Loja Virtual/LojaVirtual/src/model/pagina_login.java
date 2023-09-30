package model;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pagina_login extends JFrame {

	static pagina_login frame = new pagina_login();

	private JPanel contentPane;
	private JTextField txtNome;
	private JPasswordField pswdSenha;
	private JLabel lblNoPossuiLogin;
	private JButton btnNewButton;
	private JButton btnVoltar;
	private JButton btnEntrar;
	private String nome;
	private String senha;

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
	public pagina_login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 297, 394);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(162, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbTitulo = new JLabel("Login");
		lbTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lbTitulo.setBounds(114, 11, 79, 35);
		contentPane.add(lbTitulo);

		JLabel lbNome = new JLabel("Nome");
		lbNome.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbNome.setBounds(124, 76, 50, 17);
		contentPane.add(lbNome);

		txtNome = new JTextField();
		txtNome.setBounds(81, 104, 131, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbSenha.setBounds(124, 150, 50, 17);
		contentPane.add(lbSenha);
		
		pswdSenha = new JPasswordField();
		pswdSenha.setBounds(81, 178, 131, 19);
		contentPane.add(pswdSenha);
		
		lblNoPossuiLogin = new JLabel("Não possui login?");
		lblNoPossuiLogin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNoPossuiLogin.setBounds(93, 277, 119, 17);
		contentPane.add(lblNoPossuiLogin);
		
		btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina_cadastro cadastro = new pagina_cadastro();
				dispose();
				cadastro.setVisible(true);
			}
		});
		btnNewButton.setBounds(95, 306, 105, 23);
		contentPane.add(btnNewButton);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina_inicail inicio = new pagina_inicail();
				dispose();
				inicio.setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 11, 69, 23);
		contentPane.add(btnVoltar);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senhaConv = new String (pswdSenha.getPassword());
				if (nome.equals(txtNome.getText()) && senha.equals(senhaConv)) {
					JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Login ou senha incorreto!");
				}
			}
		});
		btnEntrar.setBounds(95, 220, 105, 23);
		contentPane.add(btnEntrar);
	}
	
	public void receberValor(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}
}
