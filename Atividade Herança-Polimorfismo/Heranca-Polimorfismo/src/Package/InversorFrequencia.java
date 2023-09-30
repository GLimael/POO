package Package;

/**
 * A classe InversorFrequencia representa um tipo espec�fico de produto fabricado pela Weg, que � um inversor de frequ�ncia.
 * Ela herda atributos e comportamentos da classe ProdutosWeg e adiciona informa��es espec�ficas de um inversor de frequ�ncia,
 * como capacidade de frequ�ncia e n�mero de fases.
 */
public class InversorFrequencia extends ProdutosWeg {

    private String capacidadeFrequencia; // Capacidade de frequ�ncia do inversor
    private int numeroFases;             // N�mero de fases do inversor

    /**
     * Construtor padr�o da classe InversorFrequencia.
     * Inicializa os atributos com valores padr�o.
     */
    public InversorFrequencia() {

    }

    /**
     * Construtor da classe InversorFrequencia com par�metros.
     *
     * @param capacidadeFrequencia A capacidade de frequ�ncia do inversor.
     * @param numeroFases          O n�mero de fases do inversor.
     */
    public InversorFrequencia(String capacidadeFrequencia, int numeroFases) {
        super(); // Chama o construtor padr�o da classe pai (ProdutosWeg)
        this.capacidadeFrequencia = capacidadeFrequencia;
        this.numeroFases = numeroFases;
    }

    /**
     * Obt�m a capacidade de frequ�ncia do inversor.
     *
     * @return A capacidade de frequ�ncia do inversor.
     */
    public String getCapacidadeFrequencia() {
        return capacidadeFrequencia;
    }

    /**
     * Define a capacidade de frequ�ncia do inversor.
     *
     * @param capacidadeFrequencia A nova capacidade de frequ�ncia do inversor.
     */
    public void setCapacidadeFrequencia(String capacidadeFrequencia) {
        this.capacidadeFrequencia = capacidadeFrequencia;
    }

    /**
     * Obt�m o n�mero de fases do inversor.
     *
     * @return O n�mero de fases do inversor.
     */
    public int getNumeroFases() {
        return numeroFases;
    }

    /**
     * Define o n�mero de fases do inversor.
     *
     * @param numeroFases O novo n�mero de fases do inversor.
     */
    public void setNumeroFases(int numeroFases) {
        this.numeroFases = numeroFases;
    }

    /**
     * Realiza uma manuten��o no inversor de frequ�ncia.
     *
     * @param servico O servi�o de manuten��o a ser realizado.
     * @param tempo   O tempo estimado de realiza��o da manuten��o.
     * @return Uma mensagem indicando que o servi�o est� sendo realizado.
     */
    public String realizarManutencao(ServicoManutencao servico, String tempo) {
        return "O servi�o " + servico.getNome() + " est� sendo realizado por " + tempo + " horas";
    }
}
