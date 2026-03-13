package projetopagamento;

public class Boleto extends Pagamento {

    private String codigoBarras;
    private String banco;
    private boolean pago;

    public Boleto(double valor, String data, String descricao,
            String codigoBarras, String banco, boolean pago) {

        super(valor, data, descricao);
        this.codigoBarras = codigoBarras;
        this.banco = banco;
        this.pago = pago;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado via boleto");
    }
}