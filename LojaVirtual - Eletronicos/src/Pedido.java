import java.util.ArrayList;

public class Pedido {

    private long numeroDoPedido;
    private String status;
    private ArrayList<Produto> carrinhousuario;
    private ArrayList<Integer> quantidades;
    private Usuário usuario;
    private Pagamento pagamento;
    private Entrega entrega;

    public Pedido(long numeroDoPedido, ArrayList<Produto> carrinhousuario, ArrayList<Integer> quantidades, Usuário usuario, Pagamento pagamento, Entrega entrega) {
        setnumeroDoPedido(numeroDoPedido);
        setStatus("Aguardando pagamento");
        setCarrinhousuario(carrinhousuario);
        setQuantidades(quantidades);
        setUsuario(usuario);
        setPagamento(pagamento);
        setEntrega(entrega);
    }

    public Pedido(long numeroDoPedido, Produto produto, int quantidade, Usuário usuario, Pagamento pagamento, Entrega entrega) {
        setnumeroDoPedido(numeroDoPedido);
        setStatus("Aguardando pagamento");

        ArrayList<Produto> carrinhousuario = new ArrayList<>();
        carrinhousuario.add(produto);
        setCarrinhousuario(carrinhousuario);

        ArrayList<Integer> quantidades = new ArrayList<>();
        quantidades.add(quantidade);
        setQuantidades(quantidades);

        setUsuario(usuario);
        setPagamento(pagamento);
        setEntrega(entrega);
    }

    public long getnumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setnumeroDoPedido(long numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Produto> getCarrinhousuario() {
        return carrinhousuario;
    }

    public void setCarrinhousuario(ArrayList<Produto> carrinhousuario) {
        this.carrinhousuario = carrinhousuario;
    }

    public ArrayList<Integer> getQuantidades() {
        return quantidades;
    }

    public void setQuantidades(ArrayList<Integer> quantidades) {
        this.quantidades = quantidades;
    }

    public Usuário getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuário usuario) {
        this.usuario = usuario;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public void notaFiscal() {
        String produtoscarrinhousuario = "";
        for (int i = 0; i < carrinhousuario.size(); i++){
            Produto p = carrinhousuario.get(i);
            Integer q = quantidades.get(i);
            produtoscarrinhousuario += "\nNome do produto: " + p.getNome() + "\nQtd. " + q + "\nPreço unit.: R$" + p.getPreco();
        }

        System.out.println("Número do pedido: " + numeroDoPedido
        + "\nusuario: " + usuario.getNome()
        + produtoscarrinhousuario
        + "\nPreço total: R$" + pagamento.getPrecoTotal());
    }

    public void acompanharStatus() {
        System.out.println(entrega.getStatus());
    }

}
