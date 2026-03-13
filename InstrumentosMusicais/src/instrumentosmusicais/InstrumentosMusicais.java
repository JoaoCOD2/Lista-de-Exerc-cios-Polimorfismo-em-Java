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
public class InstrumentosMusicais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Instrumento[] instrumento = {
            new Violao("C40", "Cordas", "Yamaha", 6, "Spruce", false),
            new Piano("U3", "Vertical", "Yamaha", 88, "Madeira e aço", true),
            new Bateria("Export", "Acústica", "Pearl", 5, "Mylar", true),
            new Flauta("YFL-222", "Flauta transversal", "Yamaha", "Prata niquelada", "C (Dó)", true),
            new Guitarra("Stratocaster", "Elétrica", "Fender", 3, "Single Coil", true)
        };
        
        for (Instrumento i : instrumento){
            i.tocar();
        }

    }
}
