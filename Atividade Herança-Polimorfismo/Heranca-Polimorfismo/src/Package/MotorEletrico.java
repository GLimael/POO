package Package;

/**
 * A classe MotorEletrico representa um tipo espec�fico de produto fabricado pela Weg, que � um motor el�trico.
 * Ela herda atributos e comportamentos da classe ProdutosWeg e adiciona informa��es espec�ficas de um motor el�trico,
 * como tipo de enrolamento e efici�ncia.
 */
public class MotorEletrico extends ProdutosWeg {

    private String tipoDeEnrolamento; // Tipo de enrolamento do motor
    private String eficiencia;        // Efici�ncia do motor

    /**
     * Construtor padr�o da classe MotorEletrico.
     * Inicializa os atributos com valores padr�o.
     */
    public MotorEletrico() {

    }

    /**
     * Construtor da classe MotorEletrico com par�metros.
     *
     * @param tipoDeEnrolamento O tipo de enrolamento do motor.
     * @param eficiencia        A efici�ncia do motor.
     */
    public MotorEletrico(String tipoDeEnrolamento, String eficiencia) {
        super(); // Chama o construtor padr�o da classe pai (ProdutosWeg)
        this.tipoDeEnrolamento = tipoDeEnrolamento;
        this.eficiencia = eficiencia;
    }

    /**
     * Obt�m o tipo de enrolamento do motor.
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
     * Obt�m a efici�ncia do motor.
     *
     * @return A efici�ncia do motor.
     */
    public String getEficiencia() {
        return eficiencia;
    }

    /**
     * Define a efici�ncia do motor.
     *
     * @param eficiencia A nova efici�ncia do motor.
     */
    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }

    /**
     * Realiza uma manuten��o no motor el�trico.
     *
     * @param servico O servi�o de manuten��o a ser realizado.
     * @param tempo   O tempo estimado de realiza��o da manuten��o.
     * @return Uma mensagem indicando que o servi�o est� sendo realizado.
     */
    public String realizarManutencao(ServicoManutencao servico, String tempo) {
        return "O servi�o " + servico.getNome() + " est� sendo realizado por " + tempo + " horas";
    }
}
