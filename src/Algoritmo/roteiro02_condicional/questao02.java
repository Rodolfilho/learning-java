package Algoritmo.roteiro02_condicional;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = teclado.nextInt();

        if(valor > 0){
            System.out.println("E maior");
        }
        else if(valor < 0){
            System.out.println("E menor");
        }
        else{
            System.out.println("E igual");
        }
    }
}
