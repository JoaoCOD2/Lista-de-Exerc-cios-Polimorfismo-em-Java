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
public class Instrumento {

    private String nome;
    private String tipo;
    private String fabricante;

    public Instrumento(String nome, String tipo, String fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFabricante() {
        return fabricante;
    }
    
    public void tocar (){
        System.out.println("Tocar instrumento");
    }
}
