package projetoforma;

public class ProjetoForma {

    public static void main(String[] args) {

        Forma[] formas = {
            new Quadrado("Azul", "Quadrado", 4, 4),
            new Retangulo("Vermelho", "Retangulo", 5, 5, 3),
            new Circulo("Amarelo", "Circulo", 3, 3),
            new Triangulo("Verde", "Triangulo", 4, 4, 2),
            new Trapezio("Roxo", "Trapezio", 5, 6, 4, 3)
        };

        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
}