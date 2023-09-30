package Package;

/**
 * A classe ServicoManutencao representa um serviço de manutenção que pode ser associado a produtos da Weg.
 * Cada serviço possui informações como nome, descrição e custo.
 */
public class ServicoManutencao {

    private String nome;       // Nome do serviço de manutenção
    private String descricao;  // Descrição do serviço
    private float custo;       // Custo do serviço em moeda local

    /**
     * Construtor padrão da classe ServicoManutencao.
     * Inicializa os atributos com valores padrão.
     */
    public ServicoManutencao() {

    }

    /**
     * Construtor da classe ServicoManutencao com parâmetros.
     *
     * @param nome     O nome do serviço de manutenção.
     * @param descricao A descrição do serviço.
     * @param custo    O custo do serviço em moeda local.
     */
    public ServicoManutencao(String nome, String descricao, float custo) {
        this.nome = nome;
        this.descricao = descricao;
        this.custo = custo;
    }

    /**
     * Obtém o nome do serviço de manutenção.
     *
     * @return O nome do serviço de manutenção.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do serviço de manutenção.
     *
     * @param nome O novo nome do serviço de manutenção.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a descrição do serviço.
     *
     * @return A descrição do serviço.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do serviço.
     *
     * @param descricao A nova descrição do serviço.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o custo do serviço.
     *
     * @return O custo do serviço em moeda local.
     */
    public float getCusto() {
        return custo;
    }

    /**
     * Define o custo do serviço.
     *
     * @param custo O novo custo do serviço em moeda local.
     */
    public void setCusto(float custo) {
        this.custo = custo;
    }
}
