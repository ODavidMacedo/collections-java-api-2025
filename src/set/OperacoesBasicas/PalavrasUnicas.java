package set.OperacoesBasicas;

import java.util.Objects;

public class PalavrasUnicas {

    private String palavra;

    public PalavrasUnicas(String palavraUnica) {
        this.palavra = palavraUnica;
    }

    public String getPalavraUnica() {
        return palavra;
    }

    @Override
    public boolean equals(Object p) {
        if (p == null || getClass() != p.getClass()) return false;
        PalavrasUnicas that = (PalavrasUnicas) p;
        return Objects.equals(palavra, that.palavra);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavra);
    }

    @Override
    public String toString() {
        return "PalavrasUnicas{" +
                "palavraUnica='" + palavra + '\'' +
                '}';
    }
}
