import java.util.ArrayList;

public class Main {
    public static ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    public static ArrayList<Usuário> listaDeClientes = new ArrayList<>();

    public static void main(String[] args) {

        criadorDeProdutos();
        criadorDeClientes();

        for (int i = 0; i < listaDeClientes.size(); i++) {
            Usuário c = listaDeClientes.get(i);
            c.enviarEmail();
            Produto p = listaDeProdutos.get(i);
            if (p.getEstoque() >= i) {
                comprar(c, p, i + 5);
            }
        }
    }

    public static void criadorDeProdutos() {
        Produto p = new Produto(79310, "Notebook", 2299.90, 50);
        listaDeProdutos.add(p);
        Produto p1 = new Produto(10379, "Computador", 3299.90, 25);
        listaDeProdutos.add(p1);
        Produto p2 = new Produto(73190, "Mesa", 299.90, 20);
        listaDeProdutos.add(p2);
    }

    public static void criadorDeClientes() {
        Usuário c = new Usuário("Rodrigo", "123.456.789-01", "rodriguinho@gmail.com", true);
        listaDeClientes.add(c);
        Usuário c1 = new Usuário("João", "098.765.432-10", "joaozinho@hotmail.com", false);
        listaDeClientes.add(c1);
        Usuário c2 = new Usuário("Pedro", "654.321.098-76", "pedrinhomatador@estudante.sc.senai.br", true);
        listaDeClientes.add(c2);
    }

    public static void comprar(Usuário cliente, Produto produto, int quantidade) {
        double precoFinal = produto.getPreco() * quantidade;
        Pagamento pagamento = new Pagamento(precoFinal, "PIX", 1);
        pagamento.calcularParcelas();

        Entrega envio = new Entrega("89.255-123", "Na casa da mãe Joana");

        Pedido novoPedido = new Pedido(123, produto, quantidade, cliente, pagamento, envio);

        cliente.adicionarPedido(novoPedido);

        novoPedido.notaFiscal();

        produto.removerEstoque(quantidade);

        envio.avisoEntrega();
    }

}
