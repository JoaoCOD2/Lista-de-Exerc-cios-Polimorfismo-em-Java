package projetoprofissao;

public class Engenheiro extends Profissao {

    private String especialidade;

    public Engenheiro(String nome, double salarioMedio, String area, String especialidade) {
        super(nome, salarioMedio, area);
        this.especialidade = especialidade;
    }

    @Override
    public void executarTrabalho() {
        System.out.println("O engenheiro está desenvolvendo um projeto.");
    }
}