package Package;

import java.util.ArrayList;

/**
 * A classe WEG representa um sistema que gerencia produtos e serviços de manutenção fabricados pela Weg.
 * Ela possui métodos para adicionar, remover e listar produtos e serviços de manutenção.
 */
public class WEG {

	/**
     * Lista de produtos gerenciados pela WEG.
     */
    private ArrayList<ProdutosWeg> listaProdutos = new ArrayList<ProdutosWeg>();

    /**
     * Lista de serviços de manutenção gerenciados pela WEG.
     */
    private ArrayList<ServicoManutencao> listaManutencao = new ArrayList<ServicoManutencao>();

    /**
     * Adiciona um produto à lista de produtos.
     *
     * @param produto O produto a ser adicionado.
     */
    public void setProduto(ProdutosWeg produto) {
        listaProdutos.add(produto);
    }

    /**
     * Remove um produto da lista de produtos.
     *
     * @param produto O produto a ser removido.
     */
    public void removeProduto(ProdutosWeg produto) {
        listaProdutos.remove(produto);
    }

    /**
     * Lista os nomes dos produtos disponíveis.
     */
    public void getProdutosDisponivel() {
        System.out.println("Produtos Disponíveis: \n");
        for (ProdutosWeg produto : listaProdutos) {
            System.out.println("\n" + produto.getNome());
        }
        System.out.println("-----------\n");
    }

    /**
     * Lista informações completas sobre os produtos.
     */
    public void getProdutosCompleto() {
        System.out.println("Produtos WEG: \n");
        for (ProdutosWeg produto : listaProdutos) {
           produto.getDescricao();
        }
        System.out.println("-----------\n");
    }

    /**
     * Adiciona um serviço de manutenção à lista de serviços.
     *
     * @param servico O serviço de manutenção a ser adicionado.
     */
    public void setServicoManutencao(ServicoManutencao servico) {
        listaManutencao.add(servico);
    }

    /**
     * Remove um serviço de manutenção da lista de serviços.
     *
     * @param servico O serviço de manutenção a ser removido.
     */
    public void removeServicoManutencao(ServicoManutencao servico) {
        listaManutencao.remove(servico);
    }

    /**
     * Lista informações sobre os serviços de manutenção.
     */
    public void getServicoManutencao() {
        System.out.println("Serviços de Manutenção: \n");
        for (ServicoManutencao servico : listaManutencao) {
            System.out.println("Nome: " + servico.getNome());
            System.out.println("Descrição: " + servico.getDescricao());
            System.out.println("Custo: " + servico.getCusto() + "\n");
        }
        System.out.println("----------\n");
    }
}
