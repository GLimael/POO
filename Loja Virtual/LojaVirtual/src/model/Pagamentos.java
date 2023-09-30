package model;

public class Pagamentos {
	
	private String forma;
	private int parcelamento;
	private float desconto;
	private float frete;
	private float total;
	
	public Pagamentos(String forma, int parcelamento, float desconto, float frete, float total) {
		this.forma = forma;
		this.parcelamento = parcelamento;
		this.desconto = desconto;
		this.frete = frete;
		this.total = total;
	}
	
	
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	public int getParcelamento() {
		return parcelamento;
	}
	public void setParcelamento(int parcelamento) {
		this.parcelamento = parcelamento;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	public float getFrete() {
		return frete;
	}
	public void setFrete(float frete) {
		this.frete = frete;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	

}
