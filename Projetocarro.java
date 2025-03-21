package com.mycompany.projetocarro;


public class Projetocarro {

    public static void main(String[] args) {
        Motorista leonardo = new Motorista("Leonardo Rosa", 178394726);
        Motorista gabriel = new Motorista("Gabriel Oliveira", 986216684);
        Motorista arthur = new Motorista("Arthur Prates", 745313968);
        
        Carro ferrari = new Carro("488 GTB", leonardo, "400CV", "Diesel");
        Carro lamborguini = new Carro("Aventador", gabriel, "450CV", "Gasolina");
        Carro fusca = new Carro("Fuscão", arthur, "53CV", "Coca Cola com Menta");
        
        System.out.println(leonardo);
        System.out.println(gabriel);
        System.out.println(arthur);
        
        System.out.println(ferrari);
        System.out.println(lamborguini);
        System.out.println(fusca);

        System.out.println("Quantidade de motoristas no sistema: " + Motorista.getQtdMotoristas());
        
        
        fusca.setMotorista(gabriel);
        System.out.println(fusca);
        System.out.println("Vezes utilizados: " + fusca.getVezesUtilizado());
    }
}
