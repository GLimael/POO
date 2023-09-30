package Package;

public class Main {
	
	public static void main(String[] args) {
		
		ProdutosWeg Gerador1 = new Gerador("Gerador a gasolina", "1122334455", "Gerador a combustão", "150cv", 330, "50kW/h", 12999, "Gasolina", "AA+");
		ProdutosWeg MotorEletrico1 = new ProdutosWeg("Motor W22", "1234567890", "Motor elétrico de médio porte", "220cv", 330, "50kW/h", 2499);
		ProdutosWeg Inversor1 = new ProdutosWeg("Inversor de Frequência M17", "0987654321", "Inversor de Frequência pequeno", "30cv", 220, "50kW/h", 699);
		ServicoManutencao servico1 = new ServicoManutencao("Manutenção de motor W22", "Eixo do rotor danificado, devido a uma queda não planejada", 120);
		ServicoManutencao servico2 = new ServicoManutencao("Manutenção de gerador à diesel", "Problema na ignição da quemia do combustível", 160);
		ServicoManutencao servico3 = new ServicoManutencao("Manutenção de Inversor de frequência M33", "Defeito na fundição da placa de inversão", 110);
		WEG weg = new WEG();
		
		weg.setProduto(Gerador1);
		weg.setProduto(MotorEletrico1);
		weg.setProduto(Inversor1);
		
		weg.setServicoManutencao(servico1);
		weg.setServicoManutencao(servico2);
		weg.setServicoManutencao(servico3);
		
		weg.getProdutosDisponivel();
		weg.getProdutosCompleto();
		weg.getServicoManutencao();
		
	}

}
