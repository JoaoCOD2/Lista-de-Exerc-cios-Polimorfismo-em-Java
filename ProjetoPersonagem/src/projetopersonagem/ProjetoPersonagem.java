package projetopersonagem;

public class ProjetoPersonagem {

    public static void main(String[] args) {

        Personagem[] personagens = {
            new Guerreiro("Thor", 10, 150, "Espada"),
            new Mago("Merlin", 12, 100, "Fogo"),
            new Arqueiro("Legolas", 11, 120, 30),
            new Ladino("Shadow", 9, 110, 95),
            new Paladino("Arthur", 13, 160, 80)
        };

        for (Personagem p : personagens) {
            p.atacar();
        }
    }
}