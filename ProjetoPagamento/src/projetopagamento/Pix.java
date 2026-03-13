package projetopagamento;

public class Pix extends Pagamento {

    private String chavePix;
    private String banco;
    private boolean confirmado;

    public Pix(double valor, String data, String descricao,
            String chavePix, String banco, boolean confirmado) {

        super(valor, data, descricao);
        this.chavePix = chavePix;
        this.banco = banco;
        this.confirmado = confirmado;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento realizado via PIX");
    }
}