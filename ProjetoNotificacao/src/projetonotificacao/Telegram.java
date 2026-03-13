package projetonotificacao;

public class Telegram extends Notificacao {

    private String usuario;

    public Telegram(String destinatario, String mensagem, String dataEnvio, String usuario) {
        super(destinatario, mensagem, dataEnvio);
        this.usuario = usuario;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensagem pelo Telegram para " + getDestinatario());
    }
}