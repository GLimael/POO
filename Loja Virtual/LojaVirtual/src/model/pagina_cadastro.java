package model;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JComboBox;

public class pagina_cadastro extends JFrame {

	static pagina_cadastro frame = new pagina_cadastro();

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JPasswordField pswdSenha;
	private JPasswordField pswdConfSenha;
	private JFormattedTextField txtCpf;
	private JFormattedTextField txtData;
	public Cliente cliente = new Cliente();
	private int contador = 0;
	private pagina_endereco paginaEndereco = new pagina_endereco();

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
	public pagina_cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(162, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbTitulo = new JLabel("Cadastro");
		lbTitulo.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lbTitulo.setBounds(340, 10, 120, 27);
		contentPane.add(lbTitulo);

		JLabel lbNome = new JLabel("Nome completo");
		lbNome.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lbNome.setBounds(38, 80, 131, 17);
		contentPane.add(lbNome);

		txtNome = new JTextField();
		txtNome.setBounds(38, 98, 131, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lbEmail = new JLabel("Email");
		lbEmail.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lbEmail.setBounds(38, 157, 50, 17);
		contentPane.add(lbEmail);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(38, 175, 131, 19);
		contentPane.add(txtEmail);

		JLabel lbCpf = new JLabel("Cpf");
		lbCpf.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lbCpf.setBounds(38, 234, 50, 17);
		contentPane.add(lbCpf);

		MaskFormatter maskCPF = null;
		try {
			maskCPF = new MaskFormatter("###.###.###-##");
			maskCPF.setPlaceholderCharacter(' ');
		} catch (ParseException ex) {
			ex.printStackTrace();
		}

		txtCpf = new JFormattedTextField(maskCPF); // Inicializa o txtCpf corretamente
		txtCpf.setColumns(14);
		txtCpf.setBounds(38, 252, 131, 19);
		contentPane.add(txtCpf);

		JLabel lbSenha = new JLabel("Senha");
		lbSenha.setFont(new Font("Tw Cen MT", Font.PLAIN, 20));
		lbSenha.setBounds(311, 78, 50, 17);
		contentPane.add(lbSenha);

		pswdSenha = new JPasswordField();
		pswdSenha.setBounds(311, 98, 131, 19);
		contentPane.add(pswdSenha);

		JLabel lbConfSenha = new JLabel("Confirme a senha");
		lbConfSenha.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lbConfSenha.setBounds(311, 212, 142, 17);
		contentPane.add(lbConfSenha);

		pswdConfSenha = new JPasswordField();
		pswdConfSenha.setBounds(311, 232, 131, 19);
		contentPane.add(pswdConfSenha);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblDataDeNascimento.setBounds(574, 80, 162, 17);
		contentPane.add(lblDataDeNascimento);

		JButton btnEndereco = new JButton("EndereÁo");
		btnEndereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				paginaEndereco.setVisible(true);
				contador++;
				paginaEndereco.getCadastro(frame);
			}
		});
		btnEndereco.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnEndereco.setBounds(574, 173, 131, 21);
		contentPane.add(btnEndereco);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina_inicail inicio = new pagina_inicail();
				dispose();
				inicio.setVisible(true);
			}
		});
		btnVoltar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnVoltar.setBounds(10, 10, 85, 21);
		contentPane.add(btnVoltar);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = new String(pswdSenha.getPassword());
				String confSenha = new String(pswdConfSenha.getPassword());
				if (txtNome.getText().trim().isEmpty() || txtEmail.getText().trim().isEmpty() || !txtCpf.isEditValid()
						|| pswdSenha.getPassword().length == 0 || pswdConfSenha.getPassword().length == 0
						|| txtData.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Complete todas as colunas!");
				} else if (!senha.equals(confSenha)) {
					JOptionPane.showMessageDialog(null, "Conifrme a senha corretamente!");
				} else {
					if (cliente.setNome(txtNome.getText()) == false) {
						JOptionPane.showMessageDialog(null, "Nome inv√°lido, use apenas letras!");
					} else if (cliente.setEmail(txtEmail.getText()) == false) {
						JOptionPane.showMessageDialog(null, "Email inv√°lido!");
					} else if (cliente.setCpf(txtCpf.getText()) == false) {
						JOptionPane.showMessageDialog(null, "Complete seu cpf!");
					} else if (cliente.setDataDeNascimento(txtData.getText()) == false) {
						JOptionPane.showMessageDialog(null, "Data de nascimento inv√°lida!");
					} else if (cliente.setSenha(senha) == false) {
						JOptionPane.showMessageDialog(null,
								"Senha inv√°lida! A senha deve ter pelo menos 8 caracteres, incluindo pelo menos uma letra mai√∫scula, uma letra min√∫scula, um n√∫mero e um caractere especial.");
					} else if (contador == 0) {
						JOptionPane.showMessageDialog(null, "… necess·rio colocar um endereÁo!");
					} else {
						cliente.setsetNome(txtNome.getText());
						cliente.setsetEmail(txtEmail.getText());
						cliente.setsetCpf(txtCpf.getText());
						cliente.setsetDataDeNascimento(txtData.getText());
						cliente.setsetSenha(senha);
						JOptionPane.showMessageDialog(null, "Cadastro efetuado!");
						pagina_login login = new pagina_login();
						dispose();
						login.setVisible(true);
						login.receberValor(txtNome.getText(), senha);
						cliente.setEndereco(paginaEndereco.getEndereco());
					}
				}
			}
		});
		btnCadastrar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCadastrar.setBounds(310, 303, 131, 21);
		contentPane.add(btnCadastrar);

		JLabel lblLogin = new JLabel("J\u00E1 possui login?");
		lblLogin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblLogin.setBounds(563, 314, 108, 17);
		contentPane.add(lblLogin);

		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				pagina_login login = new pagina_login();
				login.setVisible(true);
			}
		});
		btnLogar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnLogar.setBounds(675, 312, 85, 21);
		contentPane.add(btnLogar);

		MaskFormatter maskData = null;
		try {
			maskData = new MaskFormatter("##/##/####");
			maskData.setPlaceholderCharacter(' ');
		} catch (ParseException ex) {
			ex.printStackTrace();
		}

		txtData = new JFormattedTextField(maskData); // Inicializa o txtData corretamente
		txtData.setColumns(10);
		txtData.setBounds(574, 98, 131, 19);
		contentPane.add(txtData);

		JLabel lblLetraMaiuscula = new JLabel("1 Letra Mai\u00FAscula");
		lblLetraMaiuscula.setBounds(312, 130, 130, 14);
		contentPane.add(lblLetraMaiuscula);

		JLabel lblNumero_1 = new JLabel("1 N\u00FAmero");
		lblNumero_1.setBounds(312, 115, 130, 14);
		contentPane.add(lblNumero_1);

		JLabel lblLetraMinscula = new JLabel("1 Letra Min\u00FAscula");
		lblLetraMinscula.setBounds(311, 145, 131, 14);
		contentPane.add(lblLetraMinscula);

		JLabel lblCarcterEspecial = new JLabel("1 Car\u00E1cter Especial");
		lblCarcterEspecial.setBounds(311, 160, 131, 14);
		contentPane.add(lblCarcterEspecial);

		JLabel lblDigitos = new JLabel("8 Digitos");
		lblDigitos.setBounds(311, 175, 131, 14);
		contentPane.add(lblDigitos);
	}

	public Cliente getCliente() {
		return this.cliente;
	}
}