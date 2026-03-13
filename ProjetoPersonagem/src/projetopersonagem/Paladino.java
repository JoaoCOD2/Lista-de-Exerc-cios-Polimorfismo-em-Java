package projetopersonagem;

public class Paladino extends Personagem {

    private int fe;

    public Paladino(String nome, int nivel, int vida, int fe) {
        super(nome, nivel, vida);
        this.fe = fe;
    }

    @Override
    public void atacar() {
        System.out.println("O paladino ataca com poder sagrado!");
    }
}