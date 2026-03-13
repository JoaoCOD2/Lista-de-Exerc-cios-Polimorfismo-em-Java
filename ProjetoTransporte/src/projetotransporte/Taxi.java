package projetotransporte;

public class Taxi extends Transporte {

    private double bandeirada;
    private double distancia;

    public Taxi(String nome, int capacidade, String empresa, double bandeirada, double distancia) {
        super(nome, capacidade, empresa);
        this.bandeirada = bandeirada;
        this.distancia = distancia;
    }

    @Override
    public double calcularTarifa() {
        return bandeirada + (distancia * 2.5);
    }
}