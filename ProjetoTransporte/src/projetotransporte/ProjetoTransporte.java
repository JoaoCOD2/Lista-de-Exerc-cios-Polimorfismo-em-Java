package projetotransporte;

public class ProjetoTransporte {

    public static void main(String[] args) {

        Transporte[] transportes = {
            new Onibus("Onibus Urbano", 40, "Carris", 4.80),
            new Metro("Metro Linha 1", 200, "MetroRS", 5.00),
            new Trem("Trem Regional", 300, "Trensurb", 4.50),
            new Uber("UberX", 4, "Uber", 2.0, 10),
            new Taxi("Taxi Centro", 4, "CooperTaxi", 5.0, 10)
        };

        for (Transporte t : transportes) {
            System.out.println("Tarifa: R$" + t.calcularTarifa());
        }
    }
}