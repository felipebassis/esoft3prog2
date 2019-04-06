package br.com.unicesumar.aula20190315;

class ItemPedido {

    private double quantidade;

    private double preco;

    private double descontoPercentual;

    private Produto produto;

    private ItemPedido(double quantidade, double preco, double descontoPercentual, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.descontoPercentual = descontoPercentual;
        this.produto = produto;
    }

    static ItemPedido of(double quantidade, double preco, double descontoPercentual, Produto produto){
        return new ItemPedido(quantidade, preco, descontoPercentual, produto);
    }

    double getQuantidade() {
        return quantidade;
    }

    double getPreco() {
        return preco;
    }

    double getDescontoPercentual() {
        return descontoPercentual;
    }
}
