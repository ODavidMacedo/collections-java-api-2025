package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    public Set<PalavrasUnicas> palavrasUnicasConjunto;

    public ConjuntoPalavrasUnicas() {
        palavrasUnicasConjunto = new HashSet<>();
    }

    public void adicionarPalavraString(String palavra) {
        palavrasUnicasConjunto.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra) {
        PalavrasUnicas palavraParaRemover = null;
        for(PalavrasUnicas p : palavrasUnicasConjunto) {
            if(p.getPalavraUnica() == palavra) {
                palavraParaRemover = p;
                break;
            }
        }
        palavrasUnicasConjunto.remove(palavraParaRemover);
    }

    public void contemPalavra(String palavra) {
        if(palavrasUnicasConjunto.contains(new PalavrasUnicas(palavra))) {
            System.out.println("A palavra \"" + palavra + "\"está no conjunto.");
        }
        else {
            System.out.println("A palavra \"" + palavra + "\"não está presente no conjunto");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicasConjunto);
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas palavrasUnicasConjunto = new ConjuntoPalavrasUnicas();

        palavrasUnicasConjunto.adicionarPalavraString("caça");
        palavrasUnicasConjunto.adicionarPalavraString("bode");
        palavrasUnicasConjunto.adicionarPalavraString("cachorro");
        palavrasUnicasConjunto.adicionarPalavraString("morte");
        palavrasUnicasConjunto.adicionarPalavraString("bode");

        palavrasUnicasConjunto.exibirPalavrasUnicas();

        palavrasUnicasConjunto.contemPalavra("cão");

        palavrasUnicasConjunto.removerPalavra("bode");

        palavrasUnicasConjunto.exibirPalavrasUnicas();
    }
}
