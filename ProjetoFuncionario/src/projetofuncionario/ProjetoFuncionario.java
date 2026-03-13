package projetofuncionario;

public class ProjetoFuncionario {

    public static void main(String[] args) {

        Funcionario[] funcionarios = {
            new Gerente("Marciano", 9000, "Administração", 10, "Financeiro", true),
            new Vendedor("Yuri", 3500, "Vendas", 50000, 30, true),
            new Programador("João", 7000, "TI", "Java", 5, true),
            new Designer("Marcos", 5000, "Marketing", "Figma", "UI", true),
            new SuporteTecnico("Pedro", 3200, "TI", 120, "Nível 2", true)
        };

        for (Funcionario f : funcionarios) {
            f.trabalhar();
        }
    }
}