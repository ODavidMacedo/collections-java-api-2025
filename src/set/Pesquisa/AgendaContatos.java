package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosAgenda;

    public AgendaContatos() {
        contatosAgenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatosAgenda.add(new Contato(nome, telefone));
    }

    public void exibirContatos(){
        System.out.println(contatosAgenda);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> resultadoPorNome = new HashSet<>();
        for(Contato ag : contatosAgenda) {
            if(ag.getNome().startsWith(nome)) {
                resultadoPorNome.add(ag);
            }
        }
        return resultadoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int telefone) {
        Contato contatoAtualizado = null;
        for (Contato cont : contatosAgenda) {
            if (cont.getNome().equalsIgnoreCase(nome)) {
                cont.setTelefone(telefone);
                contatoAtualizado = cont;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos contatosAgenda = new AgendaContatos();

        contatosAgenda.adicionarContato("Camila", 123456);
        contatosAgenda.adicionarContato("Camila", 5665);
        contatosAgenda.adicionarContato("Camila Cavalcante", 1111111);
        contatosAgenda.adicionarContato("Camila DIO", 654987);
        contatosAgenda.adicionarContato("Maria Silva", 1111111);

        contatosAgenda.exibirContatos();

        System.out.println(contatosAgenda.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + contatosAgenda.atualizarNumeroContato("Maria Silva", 55101370));

        contatosAgenda.exibirContatos();
    }
}
