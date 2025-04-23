package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("David", 989020126);
        agenda.adicionarContato("Tais", 55101370);
        agenda.adicionarContato("Chiquinho", 707070);
        agenda.adicionarContato("Paçoca", 66666666);
        agenda.adicionarContato("Chiquinho", 808080);

        agenda.exibirContatos();

        agenda.removerContato("Paçoca");

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("Chiquinho"));



    }
}
