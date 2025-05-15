package exercicio01L04;

public class Main {
    public static void main(String[] args){

        Peixe peixe = new Peixe("Tambaqui", 2.200, "Água Doce");
        Cachorro cachorro = new Cachorro("Nico", 5.100, "Maltês");

        System.out.println(cachorro.toString());
        System.out.println(peixe.toString());
    }
}
