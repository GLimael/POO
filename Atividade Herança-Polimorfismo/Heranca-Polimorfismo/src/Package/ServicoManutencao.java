package Package;

/**
 * A classe ServicoManutencao representa um servi�o de manuten��o que pode ser associado a produtos da Weg.
 * Cada servi�o possui informa��es como nome, descri��o e custo.
 */
public class ServicoManutencao {

    private String nome;       // Nome do servi�o de manuten��o
    private String descricao;  // Descri��o do servi�o
    private float custo;       // Custo do servi�o em moeda local

    /**
     * Construtor padr�o da classe ServicoManutencao.
     * Inicializa os atributos com valores padr�o.
     */
    public ServicoManutencao() {

    }

    /**
     * Construtor da classe ServicoManutencao com par�metros.
     *
     * @param nome     O nome do servi�o de manuten��o.
     * @param descricao A descri��o do servi�o.
     * @param custo    O custo do servi�o em moeda local.
     */
    public ServicoManutencao(String nome, String descricao, float custo) {
        this.nome = nome;
        this.descricao = descricao;
        this.custo = custo;
    }

    /**
     * Obt�m o nome do servi�o de manuten��o.
     *
     * @return O nome do servi�o de manuten��o.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do servi�o de manuten��o.
     *
     * @param nome O novo nome do servi�o de manuten��o.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obt�m a descri��o do servi�o.
     *
     * @return A descri��o do servi�o.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descri��o do servi�o.
     *
     * @param descricao A nova descri��o do servi�o.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obt�m o custo do servi�o.
     *
     * @return O custo do servi�o em moeda local.
     */
    public float getCusto() {
        return custo;
    }

    /**
     * Define o custo do servi�o.
     *
     * @param custo O novo custo do servi�o em moeda local.
     */
    public void setCusto(float custo) {
        this.custo = custo;
    }
}
