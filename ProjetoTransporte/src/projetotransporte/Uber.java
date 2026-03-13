package projetotransporte;

public class Uber extends Transporte {

    private double precoKm;
    private double distancia;

    public Uber(String nome, int capacidade, String empresa, double precoKm, double distancia) {
        super(nome, capacidade, empresa);
        this.precoKm = precoKm;
        this.distancia = distancia;
    }

    @Override
    public double calcularTarifa() {
        return precoKm * distancia;
    }
}
