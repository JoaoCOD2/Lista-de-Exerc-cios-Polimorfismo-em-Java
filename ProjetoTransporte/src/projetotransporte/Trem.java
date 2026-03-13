package projetotransporte;

public class Trem extends Transporte {

    private double tarifa;

    public Trem(String nome, int capacidade, String empresa, double tarifa) {
        super(nome, capacidade, empresa);
        this.tarifa = tarifa;
    }

    @Override
    public double calcularTarifa() {
        return tarifa;
    }
}