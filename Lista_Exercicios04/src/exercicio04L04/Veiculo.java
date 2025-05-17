package exercicio04L04;

import java.time.Year;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected String cor;
    protected double valorVeiculo;
    protected final double aliquota;

    public Veiculo(String marca, String modelo, int ano, String cor, double valorVeiculo, double aliquota) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.valorVeiculo = valorVeiculo;
        this.aliquota = aliquota;
    }

    // Calcular IPVA
    public double calcularIPVA() {
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - ano;

        if (idade > 15) {
            return 0;
        }else{
            return aliquota * valorVeiculo;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValorVeiculo() {
        return valorVeiculo;
    }

    public void setValorVeiculo(double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }
}
