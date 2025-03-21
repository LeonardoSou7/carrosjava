package com.mycompany.projetocarro;


public class Carro {
    private String modelo;
    private Motorista motorista;
    private final Motor motor;
    private int vezesUtilizado = 0;

    public Carro(String modelo, Motorista motorista, String potencia, String tipoCombustivel){
        this.modelo = modelo;
        this.motorista = motorista;
        this.motor = new Motor(potencia, tipoCombustivel);
        this.vezesUtilizado++;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
        this.vezesUtilizado++;
    }

    public int getVezesUtilizado() {
        return vezesUtilizado;
    }

    @Override
    public String toString() {
        return "Carro {" +
                "modelo = " + modelo +
                ", motorista = " + motorista +
                ", motor = " + motor +
                ", vezesUtilizado = " + vezesUtilizado + '}';
    }
}
