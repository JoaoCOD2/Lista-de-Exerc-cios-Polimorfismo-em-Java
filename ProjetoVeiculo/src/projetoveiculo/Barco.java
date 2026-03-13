/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoveiculo;

/**
 *
 * @author joaop
 */
public class Barco extends Veiculo {

    private String tipoCasco;
    private double comprimento;
    private boolean possuiCabine;

    public Barco(String modelo, int ano, String marca, String tipoCasco, double comprimento, boolean possuiCabine) {
        super(modelo, ano, marca);
        this.tipoCasco = tipoCasco;
        this.comprimento = comprimento;
        this.possuiCabine = possuiCabine;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public double getComprimento() {
        return comprimento;
    }

    public boolean getPossuiCabine() {
        return possuiCabine;
    }

    @Override
    public void mover() {
        System.out.println("O barco esta se movendo");
    }

}
