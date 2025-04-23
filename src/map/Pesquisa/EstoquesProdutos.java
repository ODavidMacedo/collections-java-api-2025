package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EstoquesProdutos {

    private Map<Long, Produto> estoquesProdutosMap;

    public EstoquesProdutos() {
        this.estoquesProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoquesProdutosMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoquesProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        if(!estoquesProdutosMap.isEmpty()) {
            for(Produto p : estoquesProdutosMap.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double valorDoProdutoMaisCaro = Double.MIN_VALUE;
        if(!estoquesProdutosMap.isEmpty()) {
            for(Produto p : estoquesProdutosMap.values()) {
                if(p.getPreco() > valorDoProdutoMaisCaro) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoquesProdutos estoqueProduto = new EstoquesProdutos();

        estoqueProduto.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProduto.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProduto.adicionarProduto(3L, "Produto C", 2, 15.0);

        estoqueProduto.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " + estoqueProduto.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProduto.obterProdutoMaisCaro());
    }
}
