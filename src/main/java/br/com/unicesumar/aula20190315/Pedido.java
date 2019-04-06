package br.com.unicesumar.aula20190315;

import java.util.*;

public class Pedido {

    private int numero;

    private Set<ItemPedido> itens = new HashSet<>();

    Pedido(int numero, ItemPedido... itens) {
        this.numero = numero;
        addPedido(itens);
    }

    public int getNumero() {
        return numero;
    }

    List getItens() {
        return List.copyOf(itens);
    }

    private void addPedido(ItemPedido... itemPedido) {
        this.itens.addAll(Arrays.asList(itemPedido));
    }

    double getValorTotal() {
        return this.itens.stream()
                .mapToDouble(pedido -> (1 - pedido.getDescontoPercentual()/100) * pedido.getPreco() * pedido.getQuantidade())
                .sum();
    }
}
