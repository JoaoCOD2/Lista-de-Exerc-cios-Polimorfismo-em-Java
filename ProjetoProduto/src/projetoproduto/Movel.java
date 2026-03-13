package projetoproduto;

public class Movel extends Produto {

    private String material;

    public Movel(String nome, double preco, String categoria, String material) {
        super(nome, preco, categoria);
        this.material = material;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.10;
    }
}