package model;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	ArrayList<Produtos> produtos = new ArrayList<Produtos>();
	private int quantidades;
	private Cliente cliente;
	
	
	
	public CarrinhoDeCompras(ArrayList<Produtos> produtos, int quantidades, Cliente cliente) {
		this.produtos = produtos;
		this.quantidades = quantidades;
		this.cliente = cliente;
	}
	
	
	public ArrayList<Produtos> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produtos> produtos) {
		this.produtos = produtos;
	}
	public int getQuantidades() {
		return quantidades;
	}
	public void setQuantidades(int quantidades) {
		this.quantidades = quantidades;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
