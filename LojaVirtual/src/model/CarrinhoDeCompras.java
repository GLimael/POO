package model;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	private ArrayList<Produtos> produtos = new ArrayList<Produtos>();
	private int quantidades;
	private Cliente cliente;
	private double total;
	
	
	
	public CarrinhoDeCompras(int quantidades, Cliente cliente) {
		this.quantidades = quantidades;
		this.cliente = cliente;
	}
	
	public CarrinhoDeCompras() {
		
	}
	
	public void adicionarAoCarrinho (Produtos produto) {
		this.produtos.add(produto);
		this.total = produto.getValor();
	}
	
	public ArrayList<Produtos> verCarrinho (){
		return produtos;
	}
	
	public void removerDoCarrinho (Produtos produto) {
		produtos.remove(produto);
	}
	
	public double valorDoCarrinho () {
		return this.total;
	}
	
	public void finalizarCompra () {
		valorDoCarrinho ();
		
	}
	
	public int getQuantidades() {
		return quantidades;
	}
	public void setQuantidades(int quantidades) {
		if (quantidades > 0) {
			this.quantidades = quantidades;
		}
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
