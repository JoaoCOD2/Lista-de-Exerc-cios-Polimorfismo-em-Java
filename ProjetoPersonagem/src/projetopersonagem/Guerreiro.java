package projetopersonagem;

public class Guerreiro extends Personagem {

    private String arma;

    public Guerreiro(String nome, int nivel, int vida, String arma) {
        super(nome, nivel, vida);
        this.arma = arma;
    }

    @Override
    public void atacar() {
        System.out.println("O guerreiro ataca com sua espada!");
    }
}