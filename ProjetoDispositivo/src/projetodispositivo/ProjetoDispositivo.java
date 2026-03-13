package projetodispositivo;

public class ProjetoDispositivo {

    public static void main(String[] args) {

        Dispositivo[] dispositivos = {
            
            new Televisao("Samsung", "QLED 55", 120, 55),
            new Computador("Dell", "Inspiron", 300, 16),
            new Smartphone("Apple", "iPhone 14", 20, 256),
            new Tablet("Samsung", "Galaxy Tab S8", 15, 11),
            new Smartwatch("Apple", "Watch Series 9", 5, true)
        };

        for (Dispositivo d : dispositivos) {
            d.ligar();
        }
    }
}