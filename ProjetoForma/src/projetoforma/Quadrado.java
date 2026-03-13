package projetoforma;

public class Quadrado extends Forma {

    private double lado;

    public Quadrado(String cor, String nome, double dimensaoPrincipal, double lado) {
        super(cor, nome, dimensaoPrincipal);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}