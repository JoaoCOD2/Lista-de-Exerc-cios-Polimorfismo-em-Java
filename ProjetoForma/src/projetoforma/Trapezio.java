package projetoforma;

public class Trapezio extends Forma {

    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(String cor, String nome, double dimensaoPrincipal, double baseMaior, double baseMenor, double altura) {
        super(cor, nome, dimensaoPrincipal);
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}