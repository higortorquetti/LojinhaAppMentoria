package br.com.lojinha.pojo;

import br.com.lojinha.interfaces.Favorito;
import enums.Tamanho;

public class ProdutoInternacional extends Produto implements Favorito {
    private double taixaDeImportacao;

    public ProdutoInternacional(String marcaIncial, Tamanho tamanhoInicial) {
        super(marcaIncial, tamanhoInicial);
    }

    public void setValor(double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        }
        else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100");
        }

    }

    public double getTaixaDeImportacao() {
        return taixaDeImportacao;
    }

    public void setTaixaDeImportacao(double TaixaDeImportacao) {
        this.taixaDeImportacao = TaixaDeImportacao;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
