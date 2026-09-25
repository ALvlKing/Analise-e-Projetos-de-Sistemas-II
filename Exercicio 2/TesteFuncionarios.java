package exercicio2;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Ana Costa", "F001", 2500.0, "01/03/2020");
        FuncionarioCLT clt = new FuncionarioCLT("Bruno Reis", "C001", 3000.0, "10/06/2021", 220.0, 400.0);
        Gerente g = new Gerente("Carla Mendes", "G001", 8000.0, "15/01/2018", 300.0, 500.0, 12, 0.20);
        Estagiario e = new Estagiario("Diego Alves", "E001", 0.0, "05/08/2024", 1500.0, 20);

        System.out.println(f);
        System.out.println(clt);
        System.out.println(g);
        System.out.println(e);
    }
}
