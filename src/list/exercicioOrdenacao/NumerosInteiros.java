package list.exercicioOrdenacao;

import java.util.Comparator;

public class NumerosInteiros implements Comparable<NumerosInteiros> {

    private int numeroInteiro;

    public NumerosInteiros(int numeroInteiro) {
        this.numeroInteiro = numeroInteiro;
    }

    @Override
    public int compareTo(NumerosInteiros n) {
        return Integer.compare(numeroInteiro, n.getNumeroInteiro());
    }

    public int getNumeroInteiro() {
        return numeroInteiro;
    }

    @Override
    public String toString() {
        return "Números inteiros: {" + numeroInteiro +
                '}';
    }
}

class ComparadorDeNumerosInteiros implements Comparator<NumerosInteiros> {

    @Override
    public int compare(NumerosInteiros o1, NumerosInteiros o2) {
        return 0;
    }

//    @Override
//    public Comparator<NumerosInteiros> reversed() {
//        return Comparator.super.reversed();
//    }
}
