package Package;

public class Main {
	
	public static void main(String[] args) {
		
		ProdutosWeg Gerador1 = new Gerador("Gerador a gasolina", "1122334455", "Gerador a combust�o", "150cv", 330, "50kW/h", 12999, "Gasolina", "AA+");
		ProdutosWeg MotorEletrico1 = new ProdutosWeg("Motor W22", "1234567890", "Motor el�trico de m�dio porte", "220cv", 330, "50kW/h", 2499);
		ProdutosWeg Inversor1 = new ProdutosWeg("Inversor de Frequ�ncia M17", "0987654321", "Inversor de Frequ�ncia pequeno", "30cv", 220, "50kW/h", 699);
		ServicoManutencao servico1 = new ServicoManutencao("Manuten��o de motor W22", "Eixo do rotor danificado, devido a uma queda n�o planejada", 120);
		ServicoManutencao servico2 = new ServicoManutencao("Manuten��o de gerador � diesel", "Problema na igni��o da quemia do combust�vel", 160);
		ServicoManutencao servico3 = new ServicoManutencao("Manuten��o de Inversor de frequ�ncia M33", "Defeito na fundi��o da placa de invers�o", 110);
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
