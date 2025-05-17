package exercicio04L04;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota","Corolla",2015,"Prata",67000,4,"Completo", 85000);

        Moto moto = new Moto("Yamaha","Fazer 250",2006,"Azul",10000,"Street",250, "Baú, Protetor de motor",150);

        Caminhao caminhao = new Caminhao("Volvo","FH 540",2022,"Branco",750000,4,80,"Graneleira",490,16);

        System.out.println(carro.toString());
        System.out.println();
        System.out.println(moto.toString());
        System.out.println();
        System.out.println(caminhao.toString());
    }
}

