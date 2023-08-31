package br.com.lojinha.pojo;

import enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    public String marca;
    protected double valor;
    public Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;

    public Produto(String marcaIncial, Tamanho tamanhoInicial) {
        this.marca = marcaIncial;
        this.tamanho = tamanhoInicial;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        }
        else {
            throw new IllegalArgumentException("Valores devem ser maiores que 0");
        }

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public List<ItemIncluso> getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }
}
