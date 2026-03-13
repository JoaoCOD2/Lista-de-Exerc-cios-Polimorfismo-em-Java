package projetodispositivo;

public class Tablet extends Dispositivo {

    private double tamanhoTela;

    public Tablet(String marca, String modelo, double consumoEnergia, double tamanhoTela) {
        super(marca, modelo, consumoEnergia);
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public void ligar() {
        System.out.println("O tablet está iniciando");
    }
}