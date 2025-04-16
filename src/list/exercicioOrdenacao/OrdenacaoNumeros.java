package list.exercicioOrdenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    private List<NumerosInteiros> numerosInteiros;

    public OrdenacaoNumeros() {
        numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numeroInteiro) {
        numerosInteiros.add(new NumerosInteiros(numeroInteiro));
    }

    public List<NumerosInteiros> ordenarAscendente(){
        List<NumerosInteiros> listaOrdemAscendente = new ArrayList<>(numerosInteiros);
        Collections.sort(listaOrdemAscendente);
        return listaOrdemAscendente;
    }

    public List<NumerosInteiros> ordenarDescendente(){
        List<NumerosInteiros> listaOrdemDescendente = new ArrayList<>(this.numerosInteiros);
        listaOrdemDescendente.sort(Collections.reverseOrder());
        return listaOrdemDescendente;
    }

    public static void main(String[] args) {

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(57);
        ordenacaoNumeros.adicionarNumero(55);
        ordenacaoNumeros.adicionarNumero(3);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }

}


