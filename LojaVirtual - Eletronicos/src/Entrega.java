public class Entrega {

    private String cep;
    private String endereco;
    private String status;

    public Entrega(String cep, String endereco) {
        setCep(cep);
        setEndereco(endereco);
        setStatus("Em trânsito");
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void avisoEntrega(){
        System.out.println("Seu pedido foi entregue!");
    }

}
