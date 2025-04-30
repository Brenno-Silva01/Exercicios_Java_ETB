package exercicio01;

public class Main {
    public static void main(String[] args) {

        Banco b = new Banco(01, "2n Bank", "Brasil");
        ContaCorrente cc = new ContaCorrente(380881, 1, 2300);
        Endereco e = new Endereco("rua das palmeiras", 07, "(61) 94002-8922");
        Agencia a = new Agencia(03, "2N Agencia bank");
        Cliente cli1 = new Cliente("Brenno da S.", "0.111.010", "000.111.010-11");
        Cliente cli2 = new Cliente("Silvio Santos", "7.333.737", "777.33.737-33");

        System.out.println(b.toString());
        System.out.println(cc.toString());
        System.out.println(a.toString());
        System.out.println(cli1.toString());
        System.out.println(cli2.toString());
    }
}
