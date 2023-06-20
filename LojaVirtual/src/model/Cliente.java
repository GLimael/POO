package model;

import java.util.regex.Pattern;

/**
 * 
 * @author Gabriel Lima
 *
 */

public class Cliente {

	/**
	 * Criação dos atributos
	 */

	private String nome;
	private String dataDeNascimento;
	private String login;
	private String senha;
	private String endereco;
	private String cpf;
	private String email;
	private float saldo;
	private String formaDePagamento;

	/**
	 * Criação do construtor, usando apenas os parâmetros de login e senha, para que
	 * o cliente já possua um login e senha
	 */

	public Cliente(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	/**
	 * Método para login, onde o usuário insere seu login e senha, que então é
	 * verificado se está de acordo com o cadastro
	 */

	public boolean login(String login, String senha) {
		if (this.login == login && this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Criação do get e set do nome do usuário
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 2 && nome.matches("[A-Za-z]*")) {
			this.nome = nome;
		}
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		if (dataDeNascimento.matches("\\d{2}\\/\\d{2}\\/\\d{2}")) {
			this.dataDeNascimento = dataDeNascimento;
		}
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (Pattern.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", cpf))
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

}
