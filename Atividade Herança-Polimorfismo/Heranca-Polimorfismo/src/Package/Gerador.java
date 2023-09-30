package Package;

/**
 * A classe Gerador representa um tipo específico de produto fabricado pela Weg, que é um gerador.
 * Ela herda atributos e comportamentos da classe ProdutosWeg e adiciona informações específicas de um gerador,
 * como tipo de combustível e economia.
 */
public class Gerador extends ProdutosWeg {

    private String tipoCombustivel; // Tipo de combustível do gerador
    private String economia;        // Economia do gerador

    /**
     * Construtor padrão da classe Gerador.
     * Inicializa os atributos com valores padrão.
     */
    public Gerador() {

    }

    /**
     * Construtor da classe Gerador com parâmetros.
     *
     * @param tipoCombustivel O tipo de combustível do gerador.
     * @param economia        A economia do gerador.
     */
    public Gerador(String nome, String codigo, String tipo, String potencia,
            float tensao, String capacidade, float preco, String tipoCombustivel, String economia) {
        super(); // Chama o construtor padrão da classe pai (ProdutosWeg)
        this.tipoCombustivel = tipoCombustivel;
        this.economia = economia;
    }

    /**
     * Obtém o tipo de combustível do gerador.
     *
     * @return O tipo de combustível do gerador.
     */
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * Define o tipo de combustível do gerador.
     *
     * @param tipoCombustivel O novo tipo de combustível do gerador.
     */
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    /**
     * Obtém a economia do gerador.
     *
     * @return A economia do gerador.
     */
    public String getEconomia() {
        return economia;
    }

    /**
     * Define a economia do gerador.
     *
     * @param economia A nova economia do gerador.
     */
    public void setEconomia(String economia) {
        this.economia = economia;
    }

    /**
     * Realiza uma manutenção no gerador.
     *
     * @param servico O serviço de manutenção a ser realizado.
     * @param tempo   O tempo estimado de realização da manutenção.
     * @return Uma mensagem indicando que o serviço está sendo realizado.
     */
    public String realizarManutencao(ServicoManutencao servico, String tempo) {
        return "O serviço " + servico.getNome() + " está sendo realizado por " + tempo + " horas";
    }
    
    public void getDescricao() {
   	 System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Potência: " + potencia);
        System.out.println("Tensão: " + tensao);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Preço: " + preco);
   }
}
