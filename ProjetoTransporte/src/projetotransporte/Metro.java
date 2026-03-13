package projetotransporte;

public class Metro extends Transporte {

    private double tarifa;

    public Metro(String nome, int capacidade, String empresa, double tarifa) {
        super(nome, capacidade, empresa);
        this.tarifa = tarifa;
    }

    @Override
    public double calcularTarifa() {
        return tarifa;
    }
}