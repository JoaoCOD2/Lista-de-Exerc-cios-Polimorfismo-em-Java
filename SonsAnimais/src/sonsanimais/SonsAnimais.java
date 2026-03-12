package sonsanimais;

public class SonsAnimais {

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Thor", 13, 80.455, "Labrador", "Preto", true);

        System.out.println("Nome: " + c1.getNome());
        System.out.println("Raça: " + c1.getRaca());
        System.out.println("Idade: " + c1.getIdade());
        System.out.println("Peso: " + c1.getPeso());
        System.out.println("Cor: " + c1.getCor());
        System.out.println("É domestico: " + c1.getDomestico());

        c1.emitirSom();

        System.out.println("-------------------------------------------");

        Gato g1 = new Gato("Poly", 4, 2.456, "SRD", "Preto", true);

        System.out.println("Nome: " + g1.getNome());
        System.out.println("Raça: " + g1.getRaca());
        System.out.println("Idade: " + g1.getIdade());
        System.out.println("Peso: " + g1.getPeso());
        System.out.println("Cor: " + g1.getCor());
        System.out.println("É domestico: " + g1.getDomestico());

        c1.emitirSom();

        System.out.println("-------------------------------------------");

        Vaca v1 = new Vaca("Maro", 15, 700.678, "Holandesa", "Preta", true);

        System.out.println("Nome: " + v1.getNome());
        System.out.println("Raça: " + v1.getRaca());
        System.out.println("Idade: " + v1.getIdade());
        System.out.println("Peso: " + v1.getPeso());
        System.out.println("Cor: " + v1.getCor());
        System.out.println("É domestico: " + v1.getDomestico());

        v1.emitirSom();

        System.out.println("-------------------------------------------");

        Cavalo h1 = new Cavalo("Jorge", 18, 657.675, "Mangalarga Marchador", "Branco", false);

        System.out.println("Nome: " + h1.getNome());
        System.out.println("Idade: " + h1.getIdade());
        System.out.println("Peso: " + h1.getPeso());
        System.out.println("Raça: " + h1.getRaca());
        System.out.println("Cor: " + h1.getCor());
        System.out.println("É domestico: " + h1.getDomestico());

        v1.emitirSom();

        System.out.println("-------------------------------------------");

        Leao l1 = new Leao("Carlos Alberto", 5, 190, "Leão-Asiático", "Branco", false);

        System.out.println("Nome: " + l1.getNome());
        System.out.println("Idade: " + l1.getIdade());
        System.out.println("Peso: " + l1.getPeso());
        System.out.println("Raça: " + l1.getRaca());
        System.out.println("Cor: " + l1.getCor());
        System.out.println("É domestico: " + l1.getDomestico());

    }

}
