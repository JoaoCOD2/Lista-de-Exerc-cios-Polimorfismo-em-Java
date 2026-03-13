package projetoprofissao;

public class Advogado extends Profissao {

    private String tipoCaso;

    public Advogado(String nome, double salarioMedio, String area, String tipoCaso) {
        super(nome, salarioMedio, area);
        this.tipoCaso = tipoCaso;
    }

    @Override
    public void executarTrabalho() {
        System.out.println("O advogado está defendendo um cliente.");
    }
}