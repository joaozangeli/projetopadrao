package com.senac.projetopadrao.schedulingtasks;

public class Usuario {
    private String nome;
    private String senha;
    private boolean logado;

    public void logar() {

        String senhaBanco = "123";
        String nomeBanco = "lucas";


        if (this.nome == nomeBanco && this.senha == senhaBanco) {
            this.logado = true;
            System.out.println("ACESSO APROVADO");
        } else {
            System.out.println("ACESSO NEGADO");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }
}
