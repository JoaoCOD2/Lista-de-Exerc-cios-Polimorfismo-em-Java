package projetopersonagem;

public class Mago extends Personagem {

    private String magia;

    public Mago(String nome, int nivel, int vida, String magia) {
        super(nome, nivel, vida);
        this.magia = magia;
    }

    @Override
    public void atacar() {
        System.out.println("O mago lança uma magia poderosa!");
    }
}