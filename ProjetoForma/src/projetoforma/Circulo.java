package projetoforma;

public class Circulo extends Forma {

    private double raio;

    public Circulo(String cor, String nome, double dimensaoPrincipal, double raio) {
        super(cor, nome, dimensaoPrincipal);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        
              //Classe math que representa valor de PI            
        return Math.PI * raio * raio;
    }
}