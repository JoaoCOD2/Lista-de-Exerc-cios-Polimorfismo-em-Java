package projetopagamento;

public class Dinheiro extends Pagamento {

    private double valorRecebido;
    private double troco;
    private String moeda;

    public Dinheiro(double valor, String data, String descricao,
            double valorRecebido, double troco, String moeda) {

        super(valor, data, descricao);
        this.valorRecebido = valorRecebido;
        this.troco = troco;
        this.moeda = moeda;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado em dinheiro");
    }
}