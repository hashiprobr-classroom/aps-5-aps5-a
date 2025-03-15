package br.edu.insper.desagil.aps5.insee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DataTest {
    Data data = new Data();

    @Test
    public void constroi() {

        assertEquals(1970, data.getAno());
        assertEquals(1, data.getMes());
        assertEquals(1, data.getDia());


    }

    @Test
    public void naoAtualizaMenor() {

        data.atualiza(1969, 0, 0);
        assertEquals(1970, data.getAno());
        assertEquals(1, data.getMes());
        assertEquals(1, data.getDia());

    }

    @Test
    public void atualizaMaior() {

        data.atualiza(2024, 13, 32);
        assertEquals(2024, data.getAno());
        assertEquals(12, data.getMes());
        assertEquals(31, data.getDia());
    }

    @Test
    public void atualiza() {

        data.atualiza(2024, 9, 26);
        assertEquals(2024, data.getAno());
        assertEquals(9, data.getMes());
        assertEquals(26, data.getDia());

    }

    @Test
    public void comoZero() {

        assertEquals(0, data.comoInteiro());
    }

    @Test
    public void comoAgora() {

        data.atualiza(2024, 9, 26);
        assertEquals(19978, data.comoInteiro());
    }
}