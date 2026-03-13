package projetoprofissao;

public class Professor extends Profissao {

    private String disciplina;

    public Professor(String nome, double salarioMedio, String area, String disciplina) {
        super(nome, salarioMedio, area);
        this.disciplina = disciplina;
    }

    @Override
    public void executarTrabalho() {
        System.out.println("O professor está dando aula.");
    }
}