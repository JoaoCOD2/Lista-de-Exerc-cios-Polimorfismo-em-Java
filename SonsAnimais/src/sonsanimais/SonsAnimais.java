package sonsanimais;

public class SonsAnimais {

    public static void main(String[] args) {
        
        //Teste com vetor       
        Animal[] animais ={
            new Cachorro("Thor", 12, 47.984, "Labrador", "Preto", true),
            new Gato("Poly", 4, 3.599, "SRD", "Preta", true),
            new Cavalo("Carlos", 6, 469.665, "Cavalo Árabe", "Cinza", true),
            new Vaca("Maro", 14, 689.345, "Holandesa", "Marrom", false),
            new Leao("Vertro", 17, 334.455, "Leão Asiático", "Amarelo", false),
        };
        
        for (Animal a : animais){
            a.emitirSom();
        }
    }
}
