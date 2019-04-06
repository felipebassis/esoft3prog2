package br.com.unicesumar.aula20190315;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTest {

    private final Produto pc = new Produto("PC", "1234");
    private final Produto cel = new Produto("cel", "4567");

    @Test
    void shouldTestAllMethods() {

        ItemPedido itemPc = ItemPedido.of(5D, 500D, 0D, pc);
        ItemPedido itemCel = ItemPedido.of(10D, 300D, 15D, cel);

        Pedido pedido = new Pedido(1, itemPc, itemCel, itemPc);

        assertEquals(2, pedido.getItens().size());

        assertEquals(5050D, pedido.getValorTotal());
    }
}