package map.Odernacao;

import jdk.jfr.Event;
import map.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> agendaDeEventos;

    public AgendaEventos() {
        this.agendaDeEventos = new HashMap<>();
    }

    private void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaDeEventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaDeEventos);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaDeEventos);
        for(Map.Entry<LocalDate, Evento> entry : agendaDeEventos.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2024, Month.APRIL, 17), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2025, Month.AUGUST, 10), "Evento 4", "Atração 3");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();


    }

}
