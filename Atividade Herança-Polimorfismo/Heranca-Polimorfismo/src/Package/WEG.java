package Package;

import java.util.ArrayList;

/**
 * A classe WEG representa um sistema que gerencia produtos e servi�os de manuten��o fabricados pela Weg.
 * Ela possui m�todos para adicionar, remover e listar produtos e servi�os de manuten��o.
 */
public class WEG {

	/**
     * Lista de produtos gerenciados pela WEG.
     */
    private ArrayList<ProdutosWeg> listaProdutos = new ArrayList<ProdutosWeg>();

    /**
     * Lista de servi�os de manuten��o gerenciados pela WEG.
     */
    private ArrayList<ServicoManutencao> listaManutencao = new ArrayList<ServicoManutencao>();

    /**
     * Adiciona um produto � lista de produtos.
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
     * Lista os nomes dos produtos dispon�veis.
     */
    public void getProdutosDisponivel() {
        System.out.println("Produtos Dispon�veis: \n");
        for (ProdutosWeg produto : listaProdutos) {
            System.out.println("\n" + produto.getNome());
        }
        System.out.println("-----------\n");
    }

    /**
     * Lista informa��es completas sobre os produtos.
     */
    public void getProdutosCompleto() {
        System.out.println("Produtos WEG: \n");
        for (ProdutosWeg produto : listaProdutos) {
           produto.getDescricao();
        }
        System.out.println("-----------\n");
    }

    /**
     * Adiciona um servi�o de manuten��o � lista de servi�os.
     *
     * @param servico O servi�o de manuten��o a ser adicionado.
     */
    public void setServicoManutencao(ServicoManutencao servico) {
        listaManutencao.add(servico);
    }

    /**
     * Remove um servi�o de manuten��o da lista de servi�os.
     *
     * @param servico O servi�o de manuten��o a ser removido.
     */
    public void removeServicoManutencao(ServicoManutencao servico) {
        listaManutencao.remove(servico);
    }

    /**
     * Lista informa��es sobre os servi�os de manuten��o.
     */
    public void getServicoManutencao() {
        System.out.println("Servi�os de Manuten��o: \n");
        for (ServicoManutencao servico : listaManutencao) {
            System.out.println("Nome: " + servico.getNome());
            System.out.println("Descri��o: " + servico.getDescricao());
            System.out.println("Custo: " + servico.getCusto() + "\n");
        }
        System.out.println("----------\n");
    }
}
