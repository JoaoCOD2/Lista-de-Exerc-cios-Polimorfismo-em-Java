package projetopagamento;

public class Pagamento {

    private double valor;
    private String data;
    private String descricao;

    public Pagamento(double valor, String data, String descricao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento...");
    }
}