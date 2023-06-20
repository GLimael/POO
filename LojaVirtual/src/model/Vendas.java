package model;

public class Vendas {
	
	private String cliente;
	private String empresa;
	private String produto;
	
	
	public Vendas(String cliente, String empresa, String produto) {
		this.cliente = cliente;
		this.empresa = empresa;
		this.produto = produto;
	}
	
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	

}
