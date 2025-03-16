package br.edu.insper.desagil.aps5.insee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TempoTest {

    Tempo tempo = new Tempo();

    @Test
    public void constroi() {
        assertEquals(0, tempo.getHora());
        assertEquals(0, tempo.getMinuto());
    }

    @Test
    public void naoAtualizaMenor() {
        tempo.atualiza(-1, -1);
        assertEquals(0, tempo.getHora());
        assertEquals(0, tempo.getMinuto());
    }

    @Test
    public void atualizaMaior() {
        tempo.atualiza(24, 60);
        assertEquals(23, tempo.getHora());
        assertEquals(59, tempo.getMinuto());
    }

    @Test
    public void atualiza() {
        tempo.atualiza(15, 30);
        assertEquals(15, tempo.getHora());
        assertEquals(30, tempo.getMinuto());
    }

    @Test
    public void comoZero() {

        assertEquals(0, tempo.comoInteiro());
    }

    @Test
    public void comoAgora() {

        tempo.atualiza(15, 30);
        assertEquals(930, tempo.comoInteiro());
    }
}
