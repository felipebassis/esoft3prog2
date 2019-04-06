package br.com.unicesumar.aula20190315;

public class Produto {

    private String descricao;

    private String codigo;

    Produto(String descricao, String codigo) {
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigo() {
        return codigo;
    }
}
