package exercicio05L05;

public class Main {
    public static void main(String[] args) {

        Fornecedor forn = new Fornecedor("Tech Solutions Ltda.", 12345678901234L, (byte) 10, 150000.00, 80000.00);
        Cliente cli = new Cliente("João da Silva", 1234567890123L, (byte) 35, "joao.silva@email.com", "(11) 91234-5678");
        Administrador adm = new Administrador("Raimundo", 123456789012L, (byte) 45, 1001, 5500.00, "Financeiro", 800.00);
        Operario oper = new Operario("Patrícia Gomes", 9876543210987L, (byte) 27, 2002, 2800.00, "Montagem", 0.07, 8500.00);
        Vendedor vend = new Vendedor("Pedro Maria",9988776655443L, (byte) 28, 3002, 2800.00, "Vendas", 0.05, 15000.00);

        System.out.println(forn.toString());
        System.out.println(cli.toString());
        System.out.println(adm.toString());
        System.out.println(oper.toString());
        System.out.println(vend.toString());
    }
}
