package projetonotificacao;

public class Email extends Notificacao {

    private String assunto;

    public Email(String destinatario, String mensagem, String dataEnvio, String assunto) {
        super(destinatario, mensagem, dataEnvio);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando email para " + getDestinatario());
    }
}