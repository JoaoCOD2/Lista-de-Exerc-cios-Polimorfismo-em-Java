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
public class Aviao extends Veiculo {

    private int capacidadePassageiros;
    private double envergaduraAsa;
    private String tipoMotor;

    public Aviao(String modelo, int ano, String marca, int capacidadePassageiros, double envergaduraAsa, String tipoMotor) {
        super(modelo, ano, marca);
        this.capacidadePassageiros = capacidadePassageiros;
        this.envergaduraAsa = envergaduraAsa;
        this.tipoMotor = tipoMotor;
    }
    
    public int getCapacidadePassageiros(){
        return capacidadePassageiros;
    }
    
    public double getEnvergaduraAsa (){
        return envergaduraAsa;
    }
    
    public String getTipoMotor(){
        return tipoMotor;
    }
    
    @Override
    public void mover() {
        System.out.println("O avião esta se movendo");
    }
}
