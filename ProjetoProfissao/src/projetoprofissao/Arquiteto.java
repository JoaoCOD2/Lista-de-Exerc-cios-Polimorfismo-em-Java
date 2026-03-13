package projetoprofissao;

public class Arquiteto extends Profissao {

    private String tipoProjeto;

    public Arquiteto(String nome, double salarioMedio, String area, String tipoProjeto) {
        super(nome, salarioMedio, area);
        this.tipoProjeto = tipoProjeto;
    }

    @Override
    public void executarTrabalho() {
        System.out.println("O arquiteto está projetando uma construção.");
    }
}