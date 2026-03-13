package projetopagamento;

public class CartaoCredito extends Pagamento {

    private String numeroCartao;
    private String bandeira;
    private int parcelas;

    public CartaoCredito(double valor, String data, String descricao,
            String numeroCartao, String bandeira, int parcelas) {

        super(valor, data, descricao);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
        this.parcelas = parcelas;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado com cartão de crédito");
    }
}