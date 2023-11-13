package Algoritmo.roteiro01;

import java.util.Scanner;
public class questao08 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor em Celsius: ");
        float celsios = teclado.nextFloat();

        celsios = (celsios * 9 / 5 ) + 32;

        System.out.printf("A converção deu: %.1f\n", celsios);
    }
}
