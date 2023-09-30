package Package;

/**
 * A classe InversorFrequencia representa um tipo específico de produto fabricado pela Weg, que é um inversor de frequência.
 * Ela herda atributos e comportamentos da classe ProdutosWeg e adiciona informações específicas de um inversor de frequência,
 * como capacidade de frequência e número de fases.
 */
public class InversorFrequencia extends ProdutosWeg {

    private String capacidadeFrequencia; // Capacidade de frequência do inversor
    private int numeroFases;             // Número de fases do inversor

    /**
     * Construtor padrão da classe InversorFrequencia.
     * Inicializa os atributos com valores padrão.
     */
    public InversorFrequencia() {

    }

    /**
     * Construtor da classe InversorFrequencia com parâmetros.
     *
     * @param capacidadeFrequencia A capacidade de frequência do inversor.
     * @param numeroFases          O número de fases do inversor.
     */
    public InversorFrequencia(String capacidadeFrequencia, int numeroFases) {
        super(); // Chama o construtor padrão da classe pai (ProdutosWeg)
        this.capacidadeFrequencia = capacidadeFrequencia;
        this.numeroFases = numeroFases;
    }

    /**
     * Obtém a capacidade de frequência do inversor.
     *
     * @return A capacidade de frequência do inversor.
     */
    public String getCapacidadeFrequencia() {
        return capacidadeFrequencia;
    }

    /**
     * Define a capacidade de frequência do inversor.
     *
     * @param capacidadeFrequencia A nova capacidade de frequência do inversor.
     */
    public void setCapacidadeFrequencia(String capacidadeFrequencia) {
        this.capacidadeFrequencia = capacidadeFrequencia;
    }

    /**
     * Obtém o número de fases do inversor.
     *
     * @return O número de fases do inversor.
     */
    public int getNumeroFases() {
        return numeroFases;
    }

    /**
     * Define o número de fases do inversor.
     *
     * @param numeroFases O novo número de fases do inversor.
     */
    public void setNumeroFases(int numeroFases) {
        this.numeroFases = numeroFases;
    }

    /**
     * Realiza uma manutenção no inversor de frequência.
     *
     * @param servico O serviço de manutenção a ser realizado.
     * @param tempo   O tempo estimado de realização da manutenção.
     * @return Uma mensagem indicando que o serviço está sendo realizado.
     */
    public String realizarManutencao(ServicoManutencao servico, String tempo) {
        return "O serviço " + servico.getNome() + " está sendo realizado por " + tempo + " horas";
    }
}
