/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentosmusicais;

/**
 *
 * @author joaop
 */
public class Violao extends Instrumento {

    private int numeroCordas;
    private String tipoMadeira;
    private boolean eletrico;

    public Violao(String nome, String tipo, String fabricante, int numeroCordas, String tipoMadeira, boolean eletrico) {
        super(nome, tipo, fabricante);
        this.numeroCordas = numeroCordas;
        this.tipoMadeira = tipoMadeira;
        this.eletrico = eletrico;
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }

    public String getTipoMadeira() {
        return tipoMadeira;
    }

    public boolean eletrico() {
        return eletrico;
    }

    @Override
    public void tocar() {
        System.out.println("Tocar Violão");
    }

}
