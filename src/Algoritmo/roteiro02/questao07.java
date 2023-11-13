package Algoritmo.roteiro02;

import java.util.Scanner;
public class questao07 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.print("DIgite o primeiro numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo valor: ");
        int num2 = teclado.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int num3 = teclado.nextInt();

        int maior;
        if (num1 >= num2 && num1 >= num3)
            maior = num1;
        else if(num2 > num1 && num2 > num3)
            maior = num2;
        else
            maior = num3;

        System.out.println("o maior numero foi: " + maior);
    }
}
