package projetonotificacao;

public class ProjetoNotificacao {

    public static void main(String[] args) {

        Notificacao[] notificacoes = {
            new Email("joao@email.com", "Olá!", "20/03/2026", "Aviso"),
            new SMS("Carlos", "Seu código chegou", "20/03/2026", "519999999"),
            new Push("Maria", "Nova atualização", "20/03/2026", "AppBanco"),
            new WhatsApp("Pedro", "Mensagem importante", "20/03/2026", "519888888"),
            new Telegram("Ana", "Notificação nova", "20/03/2026", "@ana123")
        };

        for (Notificacao n : notificacoes) {
            n.enviar();
        }
    }
}