package projetonotificacao;

public class WhatsApp extends Notificacao {

    private String numero;

    public WhatsApp(String destinatario, String mensagem, String dataEnvio, String numero) {
        super(destinatario, mensagem, dataEnvio);
        this.numero = numero;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensagem de WhatsApp para " + getDestinatario());
    }
}