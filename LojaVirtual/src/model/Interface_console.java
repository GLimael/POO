package model;

public class Interface_console {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente ("Lima", "123");
		if (cliente.login("Lima", "123") == true) {
			System.out.println("Login efetuado");
		}else {
			System.out.println("Login ou senha inválidos!");
		}
		
		//certo
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Gabriel");
		cliente1.setDataDeNascimento("23/05/2006");
		cliente1.setLogin("Lima");
		cliente1.setSenha("123456");
		cliente1.setCpf("000.629.329-52");
		cliente1.setEmail("gabriel@gmail.com");
		cliente1.setSaldo(1200);
		
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Data de nascimento: " + cliente1.getDataDeNascimento());
		System.out.println("Login: " + cliente1.getLogin());
		System.out.println("Senha: " + cliente1.getSenha());
		System.out.println("CPF: " + cliente1.getCpf());
		System.out.println("Email: " + cliente1.getEmail());
		System.out.println("Saldo: " + cliente1.getSaldo());
		
		System.out.println("\n-------------------------------------------------\n");
		
		//errado
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Gabriel..");
		cliente2.setDataDeNascimento("123/05/2006");
		cliente2.setLogin("Lima..123");
		cliente2.setSenha("12345");
		cliente2.setCpf("000.629.329-522");
		cliente2.setEmail("gabrielgmail.com");
		cliente2.setSaldo(-1200);
		
		System.out.println("Nome: " + cliente2.getNome());
		System.out.println("Data de nascimento: " + cliente2.getDataDeNascimento());
		System.out.println("Logim: " + cliente2.getLogin());
		System.out.println("Senha: " + cliente2.getSenha());
		System.out.println("CPF: " + cliente2.getCpf());
		System.out.println("Email: " + cliente2.getEmail());
		System.out.println("Saldo: " + cliente2.getSaldo());
	}
}
