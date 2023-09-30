package Package;

/**
 * A classe ProdutosWeg representa um produto fabricado pela Weg.
 * Cada produto possui informa��es como nome, c�digo, tipo, pot�ncia,
 * tens�o, capacidade e pre�o.
 */
public class ProdutosWeg {

    private String nome;         // Nome do produto
    private String codigo;       // C�digo do produto
    private String tipo;         // Tipo do produto (ex: motor, inversor, etc.)
    private String potencia;     // Pot�ncia do produto
    private float tensao;        // Tens�o de opera��o do produto
    private String capacidade;   // Capacidade do produto (ex: em kW, em HP)
    private float preco;         // Pre�o do produto em moeda local

    /**
     * Construtor padr�o da classe ProdutosWeg.
     * Inicializa os atributos com valores padr�o.
     */
    public ProdutosWeg() {

    }

    /**
     * Construtor da classe ProdutosWeg com par�metros.
     *
     * @param nome       O nome do produto.
     * @param codigo     O c�digo �nico do produto.
     * @param tipo       O tipo ou categoria do produto.
     * @param potencia   A pot�ncia do produto.
     * @param tensao     A tens�o de opera��o do produto.
     * @param capacidade A capacidade do produto.
     * @param preco      O pre�o do produto em moeda local.
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
     * Obt�m o nome do produto.
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
     * Obt�m o c�digo do produto.
     *
     * @return O c�digo do produto.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o c�digo do produto.
     *
     * @param codigo O novo c�digo do produto.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obt�m o tipo do produto.
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
     * Obt�m a pot�ncia do produto.
     *
     * @return A pot�ncia do produto.
     */
    public String getPotencia() {
        return potencia;
    }

    /**
     * Define a pot�ncia do produto.
     *
     * @param potencia A nova pot�ncia do produto.
     */
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    /**
     * Obt�m a tens�o de opera��o do produto.
     *
     * @return A tens�o de opera��o do produto.
     */
    public float getTensao() {
        return tensao;
    }

    /**
     * Define a tens�o de opera��o do produto.
     *
     * @param tensao A nova tens�o de opera��o do produto.
     */
    public void setTensao(float tensao) {
        this.tensao = tensao;
    }

    /**
     * Obt�m a capacidade do produto.
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
     * Obt�m o pre�o do produto.
     *
     * @return O pre�o do produto.
     */
    public float getPreco() {
        return preco;
    }

    /**
     * Define o pre�o do produto.
     *
     * @param preco O novo pre�o do produto.
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
