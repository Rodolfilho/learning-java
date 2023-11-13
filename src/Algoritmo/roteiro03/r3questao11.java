package Algoritmo.roteiro03;

import java.util.Scanner;

public class r3questao11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite quantas palavras que inserir? ");
        int total = teclado.nextInt();

        teclado.nextLine();
        for(int i=0; i < total; i++){

            System.out.print("Qual a palavra: ");
            String palavra = teclado.nextLine();

            System.out.printf("O tamanho da palavra %s é %d\n",palavra, palavra.length());
        }
    }
}
