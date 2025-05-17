package exercicio03L04;

public class Main {
    public static void main(String[] args){

        Fornecedor forn = new Fornecedor("john", "QR 319, CONJ. 03, LOTE 12, SAMAMBAIA", "(61)94002-8922", 70000, 12000);
        System.out.println(forn.toString());

        Empregado emp = new Empregado("Brenno", "QR 108, CONJ. 03, CASA 14, SAMAMBAIA", "(61)91234-4567", 07, 5300, 13);
        System.out.println(emp.toString());

        Administrador adm = new Administrador("Silva", "QR 612, CONJ. 07, LOTE 03, TAGUATINGA", "(61)98597-1421", 03, 6500, 13, 1200);
        System.out.println(adm.toString());

        Operario oper = new Operario("Oliveira", "QS 621, CONJ. 14, LOTE 32, GAMA", "(61)99921-4270", 02, 3640, 13, 26000, 3);
        System.out.println(oper.toString());

        Vendedor ven = new Vendedor("Chaves", "QS 603, CONJ. 04, LOTE 10, GAMA", "(61)93311-4274", 04, 2700, 13, 31000, 2);
        System.out.println(ven.toString());
    }
}