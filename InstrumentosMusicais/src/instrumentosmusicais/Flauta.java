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
public class Flauta extends Instrumento {

    private String material;
    private String afinacao;
    private boolean transversal;

    public Flauta(String nome, String tipo, String fabricante, String material, String afinacao, boolean transversal) {
        super(nome, tipo, fabricante);
        this.material = material;
        this.afinacao = afinacao;
        this.transversal = transversal;
    }

    public String getMaterial() {
        return material;
    }

    public String getAfinacao() {
        return afinacao;
    }

    public boolean getTransversal() {
        return transversal;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocar Flauta");
    }

}
