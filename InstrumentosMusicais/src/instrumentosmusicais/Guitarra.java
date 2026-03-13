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
public class Guitarra extends Instrumento {

    private int numeroCaptadores;
    private String tipoCaptador;
    private boolean possuiAlavanca;

    public Guitarra(String nome, String tipo, String fabricante, int numeroCaptadores, String tipoCaptador, boolean possuiAlavanca) {
        super(nome, tipo, fabricante);
        this.numeroCaptadores = numeroCaptadores;
        this.tipoCaptador = tipoCaptador;
        this.possuiAlavanca = possuiAlavanca;
    }

    public int getNumeroCaptadores() {
        return numeroCaptadores;
    }

    public String getTipoCaptador() {
        return tipoCaptador;
    }

    public boolean getPussuiAlavanca() {
        return possuiAlavanca;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocar Guitarra");
    }

}
