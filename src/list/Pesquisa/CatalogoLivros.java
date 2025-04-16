package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro livro : livroList){
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosDoAutor.add(livro);
                }
            }
        }
        return livrosDoAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalosAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(Livro livro : livroList) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalosAnos.add(livro);
                }
            }
        }
        return livrosPorIntervalosAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Relato de um náufrago", "Han Kang", 1970);
        catalogoLivros.adicionarLivro("Torto Arado", "Itamar Vieira Jr.", 2018);
        catalogoLivros.adicionarLivro("A Polícia da Memória", "Yôko Ogawa", 1994);
        catalogoLivros.adicionarLivro("A Vegetariana", "Han Kang", 2007);
        catalogoLivros.adicionarLivro("Torto Arado", "Gustavo Ávila", 2017);

        System.out.println(catalogoLivros.pesquisarPorAutor("Han Kang"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990, 2010));
        System.out.println(catalogoLivros.pesquisarPorTitulo("torto arado"));
    }
}
