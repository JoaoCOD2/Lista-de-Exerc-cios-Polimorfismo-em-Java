package projetoveiculo;

public class ProjetoVeiculo {

    public static void main(String[] args) {

        Veiculo[] veiculo = {
            //           Barco(String modelo, int ano, String marca, String tipoCasco, double comprimento, boolean possuiCabine) 
            new Carro("Jetta", 2016, "Volkswagen", 4, "Cheio", true),
            new Moto("CB 500F", 2022, "Honda", 471, "Naked", true),
            new Bicicleta("Elite", 2021, "Caloi", 21, "Disco hidráulico", false),
            new Aviao("737-800", 2015, "Boeing", 189, 35.8, "Turbofan"),
            new Barco("VR5", 2020, "Bayliner", "Fibra de vidro", 6.23, false)
        };

        for (Veiculo v : veiculo) {
            v.mover();
        
        }

    }
}


