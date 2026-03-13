package projetodispositivo;

public class Smartphone extends Dispositivo {

    private int armazenamento;

    public Smartphone(String marca, String modelo, double consumoEnergia, int armazenamento) {
        super(marca, modelo, consumoEnergia);
        this.armazenamento = armazenamento;
    }

    @Override
    public void ligar() {
        System.out.println("O smartphone está ligando");
    }
}