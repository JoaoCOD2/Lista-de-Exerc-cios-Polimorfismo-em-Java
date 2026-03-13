package projetopersonagem;

public class Ladino extends Personagem {

    private int agilidade;

    public Ladino(String nome, int nivel, int vida, int agilidade) {
        super(nome, nivel, vida);
        this.agilidade = agilidade;
    }

    @Override
    public void atacar() {
        System.out.println("O ladino ataca pelas sombras!");
    }
}