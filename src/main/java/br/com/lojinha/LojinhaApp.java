package br.com.lojinha;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;
import enums.Tamanho;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Nestle", Tamanho.MEDIO);

        meuProduto.setNome("Playstation5");
        meuProduto.setValor(30);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo", 3);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabos de Energia", 2);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());

        for (ItemIncluso itemAtual: meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.5976);
        System.out.println(meuProdutoNacional.getImpostoNacional());
        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Windows", Tamanho.PEQUENO);
        meuProdutoInternacional.setValor(-99);
    }

}
