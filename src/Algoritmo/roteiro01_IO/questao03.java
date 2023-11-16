package Algoritmo.roteiro01_IO;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        double idade =teclado.nextDouble();

        //Considerando o ano bisexto
        idade = ((((idade*365.25)*24)*60)*60);

        //idade = ((((idade*365)*24)*60)*60); sem considera o ano bisexto e yipo da variavel pode ser long

        System.out.printf("Sua idade em segundo é: %.0f", idade);
    }
}
