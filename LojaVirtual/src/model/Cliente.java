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
	private String cpf;
	private String email;
	private float saldo;
	private String formaDePagamento;

	/**
	 * Criação do construtor, usando apenas os parâmetros de login e senha, para que
	 * o cliente já possua um cadastro
	 */

	public Cliente(String login, String senha) {
		if (login.matches("[A-Za-z0-9]")) {
			this.login = login;
		}
		if (senha.length() > 5) {
			this.senha = senha;
		}
	}
	
	public Cliente() {
		
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
		if (nome.matches("[A-Za-z]*")) {
			this.nome = nome;
		}
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) {
		if (dataDeNascimento.matches("\\d{2}\\/\\d{2}\\/\\d{4}")) {
			this.dataDeNascimento = dataDeNascimento;
		}
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		if (login.matches("[A-Za-z0-9]*")) {
			this.login = login;
		}
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if (senha.length() > 5) {
			this.senha = senha;
		}
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
		if(email.matches("[A-Za-z0-9]*@[A-Za-z]*.[A-Za-z]*")) {
			this.email = email;
		}
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

}
