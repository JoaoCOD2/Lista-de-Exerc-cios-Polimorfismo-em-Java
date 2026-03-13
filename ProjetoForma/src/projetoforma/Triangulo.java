package projetoforma;

public class Triangulo extends Forma {

    private double base;
    private double altura;

    public Triangulo(String cor, String nome, double dimensaoPrincipal, double base, double altura) {
        super(cor, nome, dimensaoPrincipal);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}