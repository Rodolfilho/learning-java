package Algoritmo.roteiro03_lacos;

import java.util.Scanner;

public class r3questao12 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o caracter: ");
        String caractere = teclado.nextLine();

        System.out.print("Digite a quantidade de linhas....: ");
        int linhas = teclado.nextInt();

        System.out.print("Digite a quantidade de colunas...: ");
        int colunas = teclado.nextInt();

        for(int i=0; i < linhas; i++){
            for(int j= 0; j < colunas; j++){
                System.out.print(caractere + " ");
            }
            System.out.println();
        }

    }
}
