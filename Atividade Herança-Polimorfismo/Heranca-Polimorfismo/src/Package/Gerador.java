package Package;

/**
 * A classe Gerador representa um tipo espec�fico de produto fabricado pela Weg, que � um gerador.
 * Ela herda atributos e comportamentos da classe ProdutosWeg e adiciona informa��es espec�ficas de um gerador,
 * como tipo de combust�vel e economia.
 */
public class Gerador extends ProdutosWeg {

    private String tipoCombustivel; // Tipo de combust�vel do gerador
    private String economia;        // Economia do gerador

    /**
     * Construtor padr�o da classe Gerador.
     * Inicializa os atributos com valores padr�o.
     */
    public Gerador() {

    }

    /**
     * Construtor da classe Gerador com par�metros.
     *
     * @param tipoCombustivel O tipo de combust�vel do gerador.
     * @param economia        A economia do gerador.
     */
    public Gerador(String nome, String codigo, String tipo, String potencia,
            float tensao, String capacidade, float preco, String tipoCombustivel, String economia) {
        super(); // Chama o construtor padr�o da classe pai (ProdutosWeg)
        this.tipoCombustivel = tipoCombustivel;
        this.economia = economia;
    }

    /**
     * Obt�m o tipo de combust�vel do gerador.
     *
     * @return O tipo de combust�vel do gerador.
     */
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    /**
     * Define o tipo de combust�vel do gerador.
     *
     * @param tipoCombustivel O novo tipo de combust�vel do gerador.
     */
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    /**
     * Obt�m a economia do gerador.
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
     * Realiza uma manuten��o no gerador.
     *
     * @param servico O servi�o de manuten��o a ser realizado.
     * @param tempo   O tempo estimado de realiza��o da manuten��o.
     * @return Uma mensagem indicando que o servi�o est� sendo realizado.
     */
    public String realizarManutencao(ServicoManutencao servico, String tempo) {
        return "O servi�o " + servico.getNome() + " est� sendo realizado por " + tempo + " horas";
    }
    
    public void getDescricao() {
   	 System.out.println("Nome: " + nome);
        System.out.println("C�digo: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Pot�ncia: " + potencia);
        System.out.println("Tens�o: " + tensao);
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Pre�o: " + preco);
   }
}
