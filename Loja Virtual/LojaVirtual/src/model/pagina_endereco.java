package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class pagina_endereco extends JFrame {

	private JPanel contentPane;
	private JTextField txtCEP;
	private JTextField txtCidade;
	private JTextField txtBairro;
	private JTextField txtRua;
	private JTextField txtNumero;
	private Endereco endereco = new Endereco();
	private pagina_cadastro cadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pagina_endereco frame = new pagina_endereco();
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
	public pagina_endereco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(162, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("EndereÃ§o");
		lblTitulo.setBounds(343, 10, 114, 35);
		lblTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		contentPane.add(lblTitulo);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCEP.setBounds(132, 78, 37, 18);
		contentPane.add(lblCEP);
		
		try {
            MaskFormatter cepFormatter = new MaskFormatter("#####-###");
            txtCEP = new JFormattedTextField(cepFormatter);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        txtCEP.setBounds(179, 80, 145, 19);
        contentPane.add(txtCEP);
        txtCEP.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(179, 235, 145, 19);
		contentPane.add(txtCidade);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(536, 80, 145, 19);
		contentPane.add(txtBairro);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCidade.setBounds(112, 233, 57, 18);
		contentPane.add(lblCidade);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblBairro.setBounds(469, 80, 57, 18);
		contentPane.add(lblBairro);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEstado.setBounds(112, 151, 57, 18);
		contentPane.add(lblEstado);
		
		JLabel lblRua = new JLabel("Rua");
		lblRua.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblRua.setBounds(493, 149, 33, 18);
		contentPane.add(lblRua);
		
		txtRua = new JTextField();
		txtRua.setColumns(10);
		txtRua.setBounds(536, 151, 145, 19);
		contentPane.add(txtRua);
		
		JLabel lblNumero = new JLabel("NÃºmero");
		lblNumero.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNumero.setBounds(460, 233, 66, 18);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(536, 235, 145, 19);
		contentPane.add(txtNumero);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina_cadastro cadastro = new pagina_cadastro();
				dispose();
				cadastro.setVisible(true);
			}
		});
		btnVoltar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnVoltar.setBounds(10, 10, 85, 21);
		contentPane.add(btnVoltar);

		JComboBox cbEstado = new JComboBox();
		cbEstado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		cbEstado.setModel(new DefaultComboBoxModel(new String[] {"Acre (AC)", "Alagoas (AL)", "Amap\u00E1 (AP)", "Amazonas (AM)", "Bahia (BA)", "Cear\u00E1 (CE)", "Distrito Federal (DF)", "Esp\u00EDrito Santo (ES)", "Goi\u00E1s (GO)", "Maranh\u00E3o (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Par\u00E1 (PA)", "Para\u00EDba (PB)", "Paran\u00E1 (PR)", "Pernambuco (PE)", "Piau\u00ED (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rond\u00F4nia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "S\u00E3o Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)"}));
		cbEstado.setToolTipText("");
		cbEstado.setBounds(179, 151, 145, 22);
		contentPane.add(cbEstado);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtCEP.getText().trim().isEmpty() || txtBairro.getText().trim().isEmpty() || 
						txtCidade.getText().trim().isEmpty() || txtRua.getText().trim().isEmpty() || 
						txtNumero.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Complete todas as lacunas!");
				} else if (!endereco.setCep(txtCEP.getText())) {
					JOptionPane.showMessageDialog(null, "CEP inválido!");
				} else if (!endereco.setNumero(txtNumero.getText())) {
					JOptionPane.showMessageDialog(null, "Número inválido!");
				} else {
					JOptionPane.showMessageDialog(null, "Endereço salvo!");
					endereco.setGeral(txtRua.getText(), txtCEP.getText(), txtCidade.getText(), cbEstado.getSelectedItem().toString(), txtBairro.getText(), txtNumero.getText());
					System.out.println(cbEstado.getSelectedItem().toString());
					setVisible(false);
					cadastro.setVisible(true);
				}
				
			}
		});
		btnSalvar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSalvar.setBounds(360, 314, 85, 21);
		contentPane.add(btnSalvar);
		
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void getCadastro(pagina_cadastro cadastro) {
		this.cadastro = cadastro;
	}
}
