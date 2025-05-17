package exercicio04L04;

public class Caminhao extends Veiculo{
    private int qtdEixos;
    private double cargaMax;
    private String tipoCarroceria;
    private double capacidadeTanque;
    private double comprimento;
    private static final double ALIQUOTA_CAMINAO = 0.01;

    public Caminhao(String marca, String modelo, int ano, String cor, double valorVeiculo, int qtdEixos, double cargaMax, String tipoCarroceria, double capacidadeTanque, double comprimento) {
        super(marca, modelo, ano, cor, valorVeiculo, ALIQUOTA_CAMINAO);
        this.qtdEixos = qtdEixos;
        this.cargaMax = cargaMax;
        this.tipoCarroceria = tipoCarroceria;
        this.capacidadeTanque = capacidadeTanque;
        this.comprimento = comprimento;
    }

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        double ipva = calcularIPVA();
        String resultado = "---Caminhao---" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano +
                "\nCor: " + cor +
                "\nQuantidade de Eixos: " + qtdEixos +
                "\nCarga Máxima suportada: " + cargaMax + " Toneladas" +
                "\nTipo de Carroceria: " + tipoCarroceria +
                "\nCapacidade total de litros do tanque: " + capacidadeTanque + " Litros" +
                "\nComprimento: " + comprimento + " Metros" +
                "\nValor do veículo R$: " + valorVeiculo +
                "\nValor do IPVA R$: " + ipva;

        if (ipva == 0.0) {
            resultado += "\nO veículo é isento de IPVA";
        }
        return resultado;
    }
}
