package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        dicionarioMap.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String pesquisaPorPalavra = null;
        if(!dicionarioMap.isEmpty()) {
            pesquisaPorPalavra = dicionarioMap.get(palavra);
        }
        return pesquisaPorPalavra;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Casa", "um lugar para morar");
        dicionario.adicionarPalavra("Carta", "papel com desenho");
        dicionario.adicionarPalavra("Cofre", "lugar para guardar coisas");
        dicionario.adicionarPalavra("Avião", "transporte para viajar voando");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Avião"));

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Cofre");

        dicionario.exibirPalavras();
    }
}
