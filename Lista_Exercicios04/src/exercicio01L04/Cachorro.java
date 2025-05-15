package exercicio01L04;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, Double peso, String raca){
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "--Cachorro--" +
                "\nRaca: " + raca +
                "\nNome: " + nome +
                "\nPeso: " + peso;
    }
}
