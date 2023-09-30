package Package;

/**
 * A classe MotorEletrico representa um tipo específico de produto fabricado pela Weg, que é um motor elétrico.
 * Ela herda atributos e comportamentos da classe ProdutosWeg e adiciona informações específicas de um motor elétrico,
 * como tipo de enrolamento e eficiência.
 */
public class MotorEletrico extends ProdutosWeg {

    private String tipoDeEnrolamento; // Tipo de enrolamento do motor
    private String eficiencia;        // Eficiência do motor

    /**
     * Construtor padrão da classe MotorEletrico.
     * Inicializa os atributos com valores padrão.
     */
    public MotorEletrico() {

    }

    /**
     * Construtor da classe MotorEletrico com parâmetros.
     *
     * @param tipoDeEnrolamento O tipo de enrolamento do motor.
     * @param eficiencia        A eficiência do motor.
     */
    public MotorEletrico(String tipoDeEnrolamento, String eficiencia) {
        super(); // Chama o construtor padrão da classe pai (ProdutosWeg)
        this.tipoDeEnrolamento = tipoDeEnrolamento;
        this.eficiencia = eficiencia;
    }

    /**
     * Obtém o tipo de enrolamento do motor.
     *
     * @return O tipo de enrolamento do motor.
     */
    public String getTipoDeEnrolamento() {
        return tipoDeEnrolamento;
    }

    /**
     * Define o tipo de enrolamento do motor.
     *
     * @param tipoDeEnrolamento O novo tipo de enrolamento do motor.
     */
    public void setTipoDeEnrolamento(String tipoDeEnrolamento) {
        this.tipoDeEnrolamento = tipoDeEnrolamento;
    }

    /**
     * Obtém a eficiência do motor.
     *
     * @return A eficiência do motor.
     */
    public String getEficiencia() {
        return eficiencia;
    }

    /**
     * Define a eficiência do motor.
     *
     * @param eficiencia A nova eficiência do motor.
     */
    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }

    /**
     * Realiza uma manutenção no motor elétrico.
     *
     * @param servico O serviço de manutenção a ser realizado.
     * @param tempo   O tempo estimado de realização da manutenção.
     * @return Uma mensagem indicando que o serviço está sendo realizado.
     */
    public String realizarManutencao(ServicoManutencao servico, String tempo) {
        return "O serviço " + servico.getNome() + " está sendo realizado por " + tempo + " horas";
    }
}
