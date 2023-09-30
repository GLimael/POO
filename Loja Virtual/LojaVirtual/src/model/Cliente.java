package model;

import java.util.Calendar;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
	private String senha;
	private String cpf;
	private String email;
	private Endereco endereco;
	
	/**
	 * Criação do construtor, usando todos os parâmetros
	 */
	
	public Cliente(String nome, String dataDeNascimento, String senha, String cpf,
			String email) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.senha = senha;
		this.cpf = cpf;
		this.email = email;
	}
	
	
	
	public Cliente() {
	}

	public void setGeral(String cpf, String data, String email, String nome, String senha) {
		this.cpf = cpf;
		this.dataDeNascimento = data;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public String getNome() {
		return nome;
	}
	public boolean setNome(String nome) {
		if (nome.matches("^[a-zA-Z�-�\\s]+$")) {
			return true;
		}else {
			return false;
		}
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public boolean setDataDeNascimento(String dataDeNascimento) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // Não permite datas inválidas, como 31/02/2023

        try {
            Calendar data = Calendar.getInstance();
            data.setTime(sdf.parse(dataDeNascimento));

            int ano = data.get(Calendar.YEAR);
            int mes = data.get(Calendar.MONTH) + 1; // O mês em Calendar começa em 0, então somamos 1

            // Verificar se a data está dentro do intervalo válido
            if (ano < 1930 || ano > 2018) {
                return false;
            }

            // Verificar se é um ano bissexto
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                // Se for bissexto, verificar se o mês de fevereiro tem até 29 dias
                if (mes == 2 && data.get(Calendar.DAY_OF_MONTH) > 29) {
                    return false;
                }
            } else {
                // Se não for bissexto, verificar se o mês de fevereiro tem até 28 dias
                if (mes == 2 && data.get(Calendar.DAY_OF_MONTH) > 28) {
                    return false;
                }
            }

            return true; // Data válida
        } catch (ParseException e) {
            return false; // Formato inválido da data
        }
    }
	public Calendar getDataDeNascimento(String dataDeNascimento) {
		String dataSemFormatacao = dataDeNascimento.replace("\\D", "");
	    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        sdf.setLenient(false); // Não permite datas inválidas, como 31/02/2023
        
        try {
            Calendar data = Calendar.getInstance();
            data.setTime(sdf.parse(dataDeNascimento));
            
            int ano = data.get(Calendar.YEAR);
            return data;
        } catch (ParseException e) {
        	return null;
        }
	}
	
	public String getSenha() {
		return senha;
	}
	public boolean setSenha(String senha) {
        // Regex para validar a senha
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
        return Pattern.matches(regex, senha);
    }
	public String getCpf() {
		return cpf;
	}
	public boolean setCpf(String cpf) {
		if (cpf.length() == 14) {
			return true;
		}else {
			return false;
		}
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}(\\\\.[a-zA-Z]{2,})?$")) {
			return true;
		} else {
			return false;
		}
	}
	public void setsetNome(String nome) {
		this.nome = nome;
	}
	public void setsetDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public void setsetSenha(String senha) {
		this.senha = senha;
	}
	public void setsetCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setsetEmail(String email) {
		this.email = email;
	}
}
