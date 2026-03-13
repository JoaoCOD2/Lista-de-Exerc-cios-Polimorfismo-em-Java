package projetodispositivo;

public class Computador extends Dispositivo {

    private int memoriaRAM;

    public Computador(String marca, String modelo, double consumoEnergia, int memoriaRAM) {
        super(marca, modelo, consumoEnergia);
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void ligar() {
        System.out.println("O computador está iniciando o sistema operacional");
    }
}