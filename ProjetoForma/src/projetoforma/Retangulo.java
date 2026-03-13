package projetoforma;

public class Retangulo extends Forma {

    private double largura;
    private double altura;

    public Retangulo(String cor, String nome, double dimensaoPrincipal, double largura, double altura) {
        super(cor, nome, dimensaoPrincipal);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}