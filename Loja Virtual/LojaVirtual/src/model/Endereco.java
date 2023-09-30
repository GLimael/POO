package model;

public class Endereco {

	private String rua;
	private String cep;
	private String cidade;
	private String uf;
	private String numero;
	private String bairro;
	
	
	public Endereco(String rua, String cep, String cidade, String uf, String numero, String bairro) {
		this.rua = rua;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.numero = numero;
		this.bairro = bairro;
	}
	
	public Endereco() {
		
	}
	
	public void setGeral(String rua, String cep, String cidade, String uf, String bairro, String numero) {
		this.rua = rua;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.bairro = bairro;
		this.numero = numero;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public boolean setCep(String cep) {
		if (cep.matches("^\\d{5}-\\d{3}$")) {
			return true;
		} else {
			return false;
		}
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getNumero() {
		return numero;
	}
	public boolean setNumero(String numero) {
		if (numero.matches("^\\d+$")) {
			return true;
		} else {
			return false;
		}
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
	
}
