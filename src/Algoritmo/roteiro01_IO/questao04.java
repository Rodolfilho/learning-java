package Algoritmo.roteiro01_IO;

import java.util.Scanner;
public class questao04 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        // A entrada só esta aceitando o valor de ponto flutuante com vírgula e não com ponto
        System.out.print("Digite o valor da gasolina: ");
        float preco = teclado.nextFloat();
        float PRECOLITRO = 7.27f;
        float resultado = preco/PRECOLITRO;

        System.out.printf("Total de litros é de: %.2f", resultado);

    }
}
