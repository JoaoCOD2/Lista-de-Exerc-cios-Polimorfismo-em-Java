package projetoprofissao;

public class ProjetoProfissao {

    public static void main(String[] args) {

        Profissao[] profissoes = {
            new Medico("Dr. Carlos", 15000, "Saúde", "Cardiologia"),
            new Professor("Ana", 5000, "Educação", "Matemática"),
            new Engenheiro("Lucas", 12000, "Engenharia", "Civil"),
            new Advogado("Marina", 11000, "Direito", "Criminal"),
            new Arquiteto("Pedro", 9000, "Arquitetura", "Residencial")
        };

        for (Profissao p : profissoes) {
            p.executarTrabalho();
        }
    }
}