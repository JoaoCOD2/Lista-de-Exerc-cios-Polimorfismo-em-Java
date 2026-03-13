package projetopagamento;

public class ProjetoPagamento {

    public static void main(String[] args) {

        Pagamento[] pagamentos = {
            new CartaoCredito(500, "10/03/2026", "Compra online", "1234-5678", "Visa", 3),
            new Pix(200, "11/03/2026", "Pagamento de serviço", "email@email.com", "Nubank", true),
            new Dinheiro(50, "12/03/2026", "Compra na loja", 100, 50, "Real"),
            new Boleto(1200, "13/03/2026", "Pagamento de aluguel", "237938293829", "Bradesco", true),
            new TransferenciaBancaria(300, "14/03/2026", "Pagamento freelancer", "Itaú", "12345-6", true)
        };

        for (Pagamento p : pagamentos) {
            p.processarPagamento();
        }
    }
}