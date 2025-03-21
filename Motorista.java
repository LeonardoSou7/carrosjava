package com.mycompany.projetocarro;


public class Motorista {
    private String nome;
    private int cnh;

    private static int qtdMotoristas = 0;

    public Motorista(String nome, int cnh){
        this.nome = nome;
        this.cnh = cnh;
        qtdMotoristas++;
    }

    public static int getQtdMotoristas() {
        return qtdMotoristas;
    }

    @Override
    public String toString() {
        return "Motorista {" +
                "nome = " + nome + 
                ", cnh = " + cnh + '}';
    }
}