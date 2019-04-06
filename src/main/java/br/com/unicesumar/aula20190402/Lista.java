package br.com.unicesumar.aula20190402;

public class Lista {
    private Object[] dados = new Object[0];

    void adicionar(Object elemento) {
        if (this.dados == null) {
            this.dados = new Object[1];
            this.dados[0] = elemento;
        } else {
            Object[] temporary = new Object[this.dados.length + 1];
            for (int index = 0; index < this.dados.length; index++) {
                temporary[index] = this.dados[index];
            }
            temporary[this.dados.length] = elemento;
            this.dados = temporary;
        }
    }

    void remover(int posicao) {
        Object[] temporary = new Object[this.dados.length - 1];
        int temporaryIndex = 0;
        for (int index = 0; index < dados.length; index++) {
            if (index != posicao) {
                temporary[temporaryIndex] = this.dados[index];
                temporaryIndex++;
            }
            this.dados = temporary;
        }
    }

    int obterTamanho() {
        return this.dados.length;
    }

    public void mover(int origem, int destino) {
        if (this.dados[origem] == null || this.dados[destino] == null) {
            throw new NullPointerException("Index " + origem + " ou " + destino + " está vazio");
        }

        Object temporary = this.dados[destino];

        this.dados[destino] = this.dados[origem];
        this.dados[origem] = temporary;

    }

    public Object pegar(int posicao) {
        return this.dados[posicao];
    }

    public boolean isVazia() {
        return this.dados.length == 0;
    }

}
