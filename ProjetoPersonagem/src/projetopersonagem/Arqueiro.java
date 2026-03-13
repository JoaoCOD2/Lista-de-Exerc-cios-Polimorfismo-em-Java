package projetopersonagem;

public class Arqueiro extends Personagem {

    private int flechas;

    public Arqueiro(String nome, int nivel, int vida, int flechas) {
        super(nome, nivel, vida);
        this.flechas = flechas;
    }

    @Override
    public void atacar() {
        System.out.println("O arqueiro dispara uma flecha!");
    }
}