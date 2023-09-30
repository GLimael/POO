package model;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class pagina_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pagina_menu frame = new pagina_menu();
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
	public pagina_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnProdutos = new JMenu("Produtos");
		menuBar.add(mnProdutos);
		
		JMenuItem mntmProcuraProduto = new JMenuItem("Procurar produtos");
		mnProdutos.add(mntmProcuraProduto);
		
		JMenuItem mntmVendaProduto = new JMenuItem("Vender um porduto");
		mnProdutos.add(mntmVendaProduto);
		
		JMenu mnNewMenu_2 = new JMenu("Perfil");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmInformacoes = new JMenuItem("Informações");
		mnNewMenu_2.add(mntmInformacoes);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnNewMenu_2.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(162, 255, 255));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
