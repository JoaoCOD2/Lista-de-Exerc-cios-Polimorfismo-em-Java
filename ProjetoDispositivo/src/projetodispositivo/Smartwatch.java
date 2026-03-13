package projetodispositivo;

public class Smartwatch extends Dispositivo {

    private boolean monitoramentoSaude;

    public Smartwatch(String marca, String modelo, double consumoEnergia, boolean monitoramentoSaude) {
        super(marca, modelo, consumoEnergia);
        this.monitoramentoSaude = monitoramentoSaude;
    }

    @Override
    public void ligar() {
        System.out.println("O smartwatch está sincronizando com o celular");
    }
}