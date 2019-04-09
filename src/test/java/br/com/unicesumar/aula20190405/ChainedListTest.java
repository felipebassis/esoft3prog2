package br.com.unicesumar.aula20190405;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ChainedListTest {

    @Test
    void add() {
        ChainedList<String> chainedList = new ChainedList<>();
        chainedList.add("Test");
        assertEquals("Test", chainedList.get(0));

        chainedList.add("Test2");
        assertEquals("Test2", chainedList.get(1));

        chainedList.remove("Test");
        assertEquals("Test2", chainedList.get(0));

        Executable outOfBounds = () -> chainedList.get(10);
        assertThrows(ArrayIndexOutOfBoundsException.class, outOfBounds);

        Executable removeException = () -> chainedList.remove("Teste");
        assertThrows(RuntimeException.class, removeException);
    }
}