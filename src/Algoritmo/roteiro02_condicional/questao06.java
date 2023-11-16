package Algoritmo.roteiro02_condicional;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite seu comsumo: ");
        float consumo = teclado.nextFloat();

        float total = 0, taxa = 0;

        if(consumo >= 300)
            taxa = 1.0f;
        else if(consumo >= 200 && consumo <= 299)
            taxa = 0.8f;
        else
            taxa = 0.2f;

        total = consumo * taxa;

        System.out.printf(  "Consumidor: %s\n" +
                            "Consumo mensal: %.2f\n" +
                            "Preco do kw/h em RS: %.2f\n" +
                            "Total a pagar: %.2f", nome, consumo, taxa, total);


    }
}
