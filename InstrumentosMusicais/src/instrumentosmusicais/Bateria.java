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
public class Bateria extends Instrumento {

    private int numeroTambores;
    private String tipoPele;
    private boolean possuiPratos;

    public Bateria(String nome, String tipo, String fabricante, int numeroTambores, String tipoPele, boolean possuiPratos) {
        super(nome, tipo, fabricante);
        this.numeroTambores = numeroTambores;
        this.tipoPele = tipoPele;
        this.possuiPratos = possuiPratos;
    }

    public int getNumeroTambores() {
        return numeroTambores;
    }

    public String getTipoPele() {
        return tipoPele;
    }

    public boolean getPossuiPratos() {
        return possuiPratos;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocar Bateria");
    }
}
