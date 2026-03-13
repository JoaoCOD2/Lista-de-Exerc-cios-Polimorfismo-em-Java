package projetonotificacao;

public class SMS extends Notificacao {

    private String numero;

    public SMS(String destinatario, String mensagem, String dataEnvio, String numero) {
        super(destinatario, mensagem, dataEnvio);
        this.numero = numero;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para " + getDestinatario());
    }
}