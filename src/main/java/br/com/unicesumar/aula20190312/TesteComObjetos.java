package br.com.unicesumar.aula20190312;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TesteComObjetos {
    @Test
    void shouldBeEqual() {
        Book book = new Book();

        Book otherBook = new Book();

        assertEquals(book, otherBook);
    }
}
