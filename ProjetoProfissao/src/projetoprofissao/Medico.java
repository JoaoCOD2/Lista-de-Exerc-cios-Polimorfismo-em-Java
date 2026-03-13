package projetoprofissao;

public class Medico extends Profissao {

    private String especialidade;

    public Medico(String nome, double salarioMedio, String area, String especialidade) {
        super(nome, salarioMedio, area);
        this.especialidade = especialidade;
    }

    @Override
    public void executarTrabalho() {
        System.out.println("O médico está atendendo pacientes.");
    }
}