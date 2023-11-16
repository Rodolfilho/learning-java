package Algoritmo.roteiro01_IO;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do carro: ");
        Double valorCarro = teclado.nextDouble();

        //como o valor das porcentagem é uma soma e náo é composta pode somar
        valorCarro += ((valorCarro * 0.15f) + (valorCarro * 0.45f));

        System.out.printf("O valor do carro é: %.2f", valorCarro);
    }
}
