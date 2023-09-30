package Package;

/**
 * A classe ProdutosWeg representa um produto fabricado pela Weg.
 * Cada produto possui informações como nome, código, tipo, potência,
 * tensão, capacidade e preço.
 */
public class ProdutosWeg {

    private String nome;         // Nome do produto
    private String codigo;       // Código do produto
    private String tipo;         // Tipo do produto (ex: motor, inversor, etc.)
    private String potencia;     // Potência do produto
    private float tensao;        // Tensão de operação do produto
    private String capacidade;   // Capacidade do produto (ex: em kW, em HP)
    private float preco;         // Preço do produto em moeda local

    /**
     * Construtor padrão da classe ProdutosWeg.
     * Inicializa os atributos com valores padrão.
     */
    public ProdutosWeg() {

    }

    /**
     * Construtor da classe ProdutosWeg com parâmetros.
     *
     * @param nome       O nome do produto.
     * @param codigo     O código único do produto.
     * @param tipo       O tipo ou categoria do produto.
     * @param potencia   A potência do produto.
     * @param tensao     A tensão de operação do produto.
     * @param capacidade A capacidade do produto.
     * @param preco      O preço do produto em moeda local.
     */
    public ProdutosWeg(String nome, String codigo, String tipo, String potencia,
                       float tensao, String capacidade, float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.tipo = tipo;
        this.potencia = potencia;
        this.tensao = tensao;
        this.capacidade = capacidade;
        this.preco = preco;
    }

    /**
     * Obtém o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     *
     * @param nome O novo nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o código do produto.
     *
     * @return O código do produto.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o código do produto.
     *
     * @param codigo O novo código do produto.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtém o tipo do produto.
     *
     * @return O tipo do produto.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do produto.
     *
     * @param tipo O novo tipo do produto.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém a potência do produto.
     *
     * @return A potência do produto.
     */
    public String getPotencia() {
        return potencia;
    }

    /**
     * Define a potência do produto.
     *
     * @param potencia A nova potência do produto.
     */
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    /**
     * Obtém a tensão de operação do produto.
     *
     * @return A tensão de operação do produto.
     */
    public float getTensao() {
        return tensao;
    }

    /**
     * Define a tensão de operação do produto.
     *
     * @param tensao A nova tensão de operação do produto.
     */
    public void setTensao(float tensao) {
        this.tensao = tensao;
    }

    /**
     * Obtém a capacidade do produto.
     *
     * @return A capacidade do produto.
     */
    public String getCapacidade() {
        return capacidade;
    }

    /**
     * Define a capacidade do produto.
     *
     * @param capacidade A nova capacidade do produto.
     */
    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * Obtém o preço do produto.
     *
     * @return O preço do produto.
     */
    public float getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto.
     *
     * @param preco O novo preço do produto.
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void getDescricao() {
    	getNome();
    	getCodigo();
    	getTipo();
    	getPotencia();
    	getTensao();
    	getCapacidade();
    	getPreco();
    }
}
