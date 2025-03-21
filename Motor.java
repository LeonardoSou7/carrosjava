package com.mycompany.projetocarro;


public class Motor {
    private final String potencia;
    private final String tipocombustivel;

    public Motor(String potencia, String tipocombustivel) {
        this.potencia = potencia;
        this.tipocombustivel = tipocombustivel;
    }

    @Override
    public String toString() {
        return "Motor {" +
                "potencia = " + potencia +
                ", tipocombustivel = " + tipocombustivel + '}';
    }
}