package projetotransporte;

public class Onibus extends Transporte {

    private double tarifaBase;

    public Onibus(String nome, int capacidade, String empresa, double tarifaBase) {
        super(nome, capacidade, empresa);
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularTarifa() {
        return tarifaBase;
    }
}