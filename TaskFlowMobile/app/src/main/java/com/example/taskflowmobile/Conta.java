package com.example.taskflowmobile;

import java.io.Serializable;

public class Conta implements Serializable {

    private String titulo;
    private String opcao;
    private String importanteTexto;

    public Conta(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public String getImportanteTexto() {
        return importanteTexto;
    }

    public void setImportanteTexto(String importanteTexto) {
        this.importanteTexto = importanteTexto;
    }
}

