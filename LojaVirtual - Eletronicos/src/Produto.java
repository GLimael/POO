public class Produto {

    private long numeroDeCadastro;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(long numeroDeCadastro, String nome, double preco, int estoque) {
        setNumeroDeCadastro(numeroDeCadastro);
        setNome(nome);
        setPreco(preco);
        setEstoque(estoque);
    };

    public long getNumeroDeCadastro() {
        return numeroDeCadastro;
    }

    public void setNumeroDeCadastro(long numeroDeCadastro) {
        this.numeroDeCadastro = numeroDeCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void alterarPreco(double preco) {
        setPreco(preco);
    }

    public void adicionarEstoque(int quantidade) {
        setEstoque(estoque + quantidade);
    }

    public void removerEstoque(int quantidade) {
        setEstoque(estoque - quantidade);
    }

}
