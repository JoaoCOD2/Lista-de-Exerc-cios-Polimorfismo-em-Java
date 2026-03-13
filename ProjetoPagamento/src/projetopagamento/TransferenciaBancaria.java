package projetopagamento;

public class TransferenciaBancaria extends Pagamento {

    private String banco;
    private String contaDestino;
    private boolean confirmado;

    public TransferenciaBancaria(double valor, String data, String descricao,
            String banco, String contaDestino, boolean confirmado) {

        super(valor, data, descricao);
        this.banco = banco;
        this.contaDestino = contaDestino;
        this.confirmado = confirmado;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado por transferência bancária");
    }
}