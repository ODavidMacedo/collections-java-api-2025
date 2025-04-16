package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoas> listaPessoas;

    public OrdenacaoPessoas() {
        listaPessoas = new ArrayList<>();
    }

    public void adicionaPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordenarPorIdade() {
        List<Pessoas> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoas> ordenarPorAltura(){
        List<Pessoas> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

public static void main(String[] args) {

    OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
    ordenacaoPessoa.adicionaPessoa("Fernando", 20, 1.56);
    ordenacaoPessoa.adicionaPessoa("Carlos", 30, 1.80);
    ordenacaoPessoa.adicionaPessoa("David", 25, 1.70);
    ordenacaoPessoa.adicionaPessoa("Tais", 17, 1.56);

    System.out.println(ordenacaoPessoa.listaPessoas);

    System.out.println(ordenacaoPessoa.ordenarPorIdade());
    System.out.println(ordenacaoPessoa.ordenarPorAltura());
}
}
