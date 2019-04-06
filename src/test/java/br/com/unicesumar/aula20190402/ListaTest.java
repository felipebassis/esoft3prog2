package br.com.unicesumar.aula20190402;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaTest {
    @Test
    void teste() {
        Lista lista = new Lista();
        lista.adicionar(0);
        lista.adicionar(1.2);
        lista.adicionar("três");

        assertEquals(0, lista.pegar(0));
        assertEquals(1.2, lista.pegar(1));
        assertEquals("três", lista.pegar(2));
        assertEquals(3,lista.obterTamanho());

        lista.remover(0);

        assertEquals(1.2, lista.pegar(0));
    }
}