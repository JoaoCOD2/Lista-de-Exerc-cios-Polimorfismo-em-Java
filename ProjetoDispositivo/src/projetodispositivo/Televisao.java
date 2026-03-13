package projetodispositivo;

public class Televisao extends Dispositivo {

    private int tamanhoTela;

    public Televisao(String marca, String modelo, double consumoEnergia, int tamanhoTela) {
        super(marca, modelo, consumoEnergia);
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public void ligar() {
        System.out.println("A televisão está ligando e exibindo imagem");
    }
}