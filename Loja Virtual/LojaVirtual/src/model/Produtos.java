package model;

public class Produtos {
	
	private float valor;
	private String nome;
	private String categoria;
	private String avaliacao;
	private String descricao;
	private String modelo;
	private String marca;
	private String cor;
	private String quantidadeEstoque;
	private String imagens;
	
	public Produtos(float valor, String nome, String categoria, String avaliacao, String descricao, String modelo,
			String marca, String cor, String quantidadeEstoque, String imagens) {
		this.valor = valor;
		this.nome = nome;
		this.categoria = categoria;
		this.avaliacao = avaliacao;
		this.descricao = descricao;
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.quantidadeEstoque = quantidadeEstoque;
		this.imagens = imagens;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(String quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public String getImagens() {
		return imagens;
	}
	public void setImagens(String imagens) {
		this.imagens = imagens;
	}
	
	

}
