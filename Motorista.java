package com.mycompany.aula20250317;


import java.util.concurrent.atomic.AtomicInteger;

public class Motorista {
    private static final AtomicInteger contadorMotoristas = new AtomicInteger(0);
    private String nome;
    private int cnh;
    private String telefone;
    
    
    public static int getQuantidadeMotoristas() {
    return contadorMotoristas.get();
}
   
    public String getNome() {
        return nome;
    }

    public int getCnh() {
        return cnh;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    
    public Motorista(String nome, int cnh, String telefone) {
        this.nome = nome;
        this.cnh = cnh;
        this.telefone = telefone;
        contadorMotoristas.incrementAndGet();
    }
    
    
    
}
