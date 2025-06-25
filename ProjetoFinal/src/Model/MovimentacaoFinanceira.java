package Model;

import java.time.LocalDate;

public abstract class MovimentacaoFinanceira {
    //Atributos
    protected int id;
    protected String descricao;
    protected double valor;
    public LocalDate data;
    protected String observacoes;
    protected Categoria categoria;

    //Construtor
    public MovimentacaoFinanceira(int id, String descricao, double valor, LocalDate data, String observacoes, Categoria categoria) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.observacoes = observacoes;
        this.categoria = categoria;
    }

    //Metodos abstratos
    public abstract void registrar();
    public abstract double calcularImpactoNoSaldo();


    //Gets e Sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    //ToString
    @Override
    public String toString() {
        return "[" + categoria.getNome() + "] " + descricao + " - R$ " + valor + " - Data: " + data;
    }
}

