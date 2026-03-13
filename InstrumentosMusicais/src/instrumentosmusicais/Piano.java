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
public class Piano extends Instrumento {

    private int numeroTeclas;
    private String material;
    private boolean possuiPedais;

    public Piano(String nome, String tipo, String fabricante, int numeroTeclas, String material, boolean possuiPedais) {
        super(nome, tipo, fabricante);
        this.numeroTeclas = numeroTeclas;
        this.material = material;
        this.possuiPedais = possuiPedais;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public String getMaterial() {
        return material;
    }

    public boolean getPossuiPedais() {
        return possuiPedais;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocar Piano");
    }
}
