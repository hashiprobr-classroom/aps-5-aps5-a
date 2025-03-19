package br.edu.insper.desagil.aps5.insee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class AgendaTest {

    private Agenda agenda = new Agenda();
    DataTempo inicio = new DataTempo(new Data(), new Tempo());
    DataTempo fim = new DataTempo(new Data(), new Tempo());
    Evento evento = new Evento(inicio, fim);

    @Test
    public void constroi() {
        assertTrue(agenda.getEventos().isEmpty());
    }

    @Test
    public void adicionaValido() {
        fim.getTempo().atualiza(1, 0);

        agenda.adiciona(evento);

        assertEquals(1, agenda.getEventos().size());
        assertTrue(agenda.getEventos().contains(evento));
    }


    @Test
    public void adicionaInvalido() {

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> agenda.adiciona(evento));

        assertEquals("Evento inválido!", e.getMessage());
        assertTrue(agenda.getEventos().isEmpty());
    }
}