package exercicio04L04;

public class Moto extends Veiculo{
    private String tipoMoto;
    private int cilindrada;
    private String acessorios;
    private int velocidadeMax;
    private static final double ALIQUOTA_MOTO = 0.02;

    public Moto(String marca, String modelo, int ano, String cor, double valorVeiculo, String tipoMoto, int cilindrada, String acessorios, int velocidadeMax) {
        super(marca, modelo, ano, cor, valorVeiculo, ALIQUOTA_MOTO);
        this.tipoMoto = tipoMoto;
        this.cilindrada = cilindrada;
        this.acessorios = acessorios;
        this.velocidadeMax = velocidadeMax;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    @Override
    public String toString() {
        double ipva = calcularIPVA();
        String resultado = "---Moto---" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano +
                "\nCor: " + cor +
                "\nEstilo de Moto: " + tipoMoto +
                "\nCilindrada: " + cilindrada + "cc" +
                "\nAcessorios: " + acessorios +
                "\nVelocidade Máxima: " + velocidadeMax +
                "\nValor do veículo R$: " + valorVeiculo +
                "\nValor do IPVA R$: " + ipva;

        if (ipva == 0.0) {
            resultado += "\nO veículo é isento de IPVA";
        }
        return resultado;
    }
}
