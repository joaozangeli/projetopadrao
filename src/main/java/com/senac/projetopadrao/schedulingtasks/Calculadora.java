package com.senac.projetopadrao.schedulingtasks;

public class Calculadora {
    private int digito1;
    private int digito2;
    private int soma;
    private int subtracao;

    public void somar(int digito1, int digito2) {
        this.soma = digito1 + digito2;

    }

    public int getDigito1() {
        return digito1;
    }

    public void setDigito1(int digito1) {
        this.digito1 = digito1;
    }

    public int getDigito2() {
        return digito2;
    }

    public void setDigito2(int digito2) {
        this.digito2 = digito2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }


    public void subtrair(int digito1, int digito2) {
        this.subtracao = digito1 - digito2;
    }

    public int getSubtracao() {
        return subtracao;
    }

    public void setSubtracao(int subtracao) {
        this.subtracao = subtracao;
    }
}
