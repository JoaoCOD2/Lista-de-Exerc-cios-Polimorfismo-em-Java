package projetofuncionario;

public class SuporteTecnico extends Funcionario {

    private int chamadosResolvidos;
    private String nivel;
    private boolean atendimentoRemoto;

    public SuporteTecnico(String nome, double salario, String setor, int chamadosResolvidos, String nivel, boolean atendimentoRemoto) {
        super(nome, salario, setor);
        this.chamadosResolvidos = chamadosResolvidos;
        this.nivel = nivel;
        this.atendimentoRemoto = atendimentoRemoto;
    }

    @Override
    public void trabalhar() {
        System.out.println("O suporte técnico está resolvendo problemas");
    }
}