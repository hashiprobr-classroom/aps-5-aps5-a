package br.edu.insper.desagil.aps5.insee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class AgendaTest {

    private Agenda agenda = new Agenda();

    @Test
    public void constroi() {
        assertTrue(agenda.getEventos().isEmpty());
    }

    @Test
    public void adicionaValido() {
        // nao soube fazer
    }

    @Test
    public void adicionaInvalido() {
        DataTempo inicio = new DataTempo(new Data(), new Tempo());
        DataTempo fim = new DataTempo(new Data(), new Tempo());
        Evento evento = new Evento(inicio, fim);

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> agenda.adiciona(evento));

        assertEquals("Evento inválido!", e.getMessage());
        assertTrue(agenda.getEventos().isEmpty());
    }
}