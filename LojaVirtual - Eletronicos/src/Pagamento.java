public class Pagamento {

    private double precoTotal;
    private String metodoDePagamento;
    private int parcelas;

    public Pagamento(double precoTotal, String metodoDePagamento, int parcelas) {
        setprecoTotal(precoTotal);
        setmetodoDePagamento(metodoDePagamento);
        setParcelas(parcelas);
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setprecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public String getmetodoDePagamento() {
        return metodoDePagamento;
    }

    public void setmetodoDePagamento(String metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public void calcularParcelas(){
        System.out.println("O valor de cada parcela será: R$" + (precoTotal / parcelas));
    }

}
