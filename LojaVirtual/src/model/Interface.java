package model;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Interface {
	
	public static void main(String[] args) {
		ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
		
		
		JLabel lbNome = new JLabel("Nome: ");
		JLabel lbPreco = new JLabel("Preço: ");
		JLabel lbCategoria = new JLabel("Categoria: ");
		JLabel lbAvaliacao = new JLabel("Avaliação: ");
		JTextField txNome = new JTextField();
		JTextField txPreco = new JTextField();
		JComboBox cbCategoria = new JComboBox();
		cbCategoria.addItem("Esportes");
		cbCategoria.addItem("Infantil");
		cbCategoria.addItem("Tecnologia");
		cbCategoria.addItem("Lazer");
		cbCategoria.addItem("Cozinha");
		
		JTable tabelaProdutos = new JTable(new Object[][] {{"Batata", "1.95"}, {"Banana", "1.25"}}, new Object[] {"Nome", "Preço"});
		
		Object[] componentes = {lbNome, txNome, lbPreco, txPreco, lbCategoria, cbCategoria, tabelaProdutos
				
		};
		
		JOptionPane.showMessageDialog(null, componentes, "Cadastrar produto", JOptionPane.WARNING_MESSAGE);
	
		Produtos p = new Produtos();
		p.setNome(txNome.getText());	
		p.setValor(Double.parseDouble(txPreco.getText()));
		p.setCategoria(cbCategoria.getSelectedItem());
		listaProdutos.add(p);		
		for(int i = 0; i < listaProdutos.size(); i++) {
			System.out.println("\nNome: " + listaProdutos.get(i).getNome() + "\nPreço: " + listaProdutos.get(i).getValor() + "\nCategoria: " + listaProdutos.get(i).getCategoria());
		}
	}
	

}
