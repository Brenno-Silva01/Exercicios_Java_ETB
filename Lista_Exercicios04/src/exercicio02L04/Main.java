package exercicio02L04;

public class Main {
    public static void main(String[] args){

        Cliente cli = new Cliente();
        cli.setNome("Joaquim");
        cli.setIdade(42);
        cli.setSexo("Masculino");
        cli.setValorDivida(560);
        cli.setAnoNascim(1983);

        System.out.println(cli.toString());

        Gerente ger = new Gerente();
        ger.setNome("Claúdia");
        ger.setIdade(33);
        ger.setMatricula("380881");
        ger.setNomeGerencia("Vendas");
        ger.setSalario(3700);

        System.out.println(ger.toString());

        Vendedor ven = new Vendedor();
        ven.setNome("Dejair");
        ven.setSalario(2300);
        ven.setValorVendas(56000);
        ven.setQntVendas(9);

        System.out.println(ven.toString());
    }
}
