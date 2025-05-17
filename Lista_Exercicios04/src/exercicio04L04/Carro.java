package exercicio04L04;

public class Carro extends Veiculo{
    private int qtdPortas;
    private String opcionais;
    private double km;
    private static final double ALIQUOTA_CARRO = 0.03;

    public Carro(String marca, String modelo, int ano, String cor, double valorVeiculo, int qtdPortas, String opcionais, double km) {
        super(marca, modelo, ano, cor, valorVeiculo, ALIQUOTA_CARRO);
        this.qtdPortas = qtdPortas;
        this.opcionais = opcionais;
        this.km = km;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public String toString() {
        double ipva = calcularIPVA();
        String resultado = "---Carro---" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano +
                "\nCor: " + cor +
                "\nQuantidade de Portas: " + qtdPortas + "p" +
                "\nOpcionais: " + opcionais +
                "\nkm: " + km +
                "\nValor do veículo R$: " + valorVeiculo +
                "\nValor do IPVA R$: " + ipva;

        if (ipva == 0.0) {
            resultado += "\nO veículo é isento de IPVA";
        }
        return resultado;
    }
}
