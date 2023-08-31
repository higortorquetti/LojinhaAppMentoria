package br.com.lojinha.pojo;


import br.com.lojinha.interfaces.Favorito;
import enums.Tamanho;

public class ProdutoNacional extends Produto implements Favorito {

    private double impostoNacional;

    public ProdutoNacional(String marcaIncial, Tamanho tamanhoInicial) {
        super(marcaIncial, tamanhoInicial);
    }

    public double getImpostoNacional() {
        return impostoNacional;
    }

    public void setImpostoNacional(double NovoImpostoNacional) {
        this.impostoNacional = NovoImpostoNacional;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
