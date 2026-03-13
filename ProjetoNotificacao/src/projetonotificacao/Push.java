package projetonotificacao;

public class Push extends Notificacao {

    private String aplicativo;

    public Push(String destinatario, String mensagem, String dataEnvio, String aplicativo) {
        super(destinatario, mensagem, dataEnvio);
        this.aplicativo = aplicativo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificação push para " + getDestinatario());
    }
}