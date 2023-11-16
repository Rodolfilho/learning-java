package Algoritmo.roteiro03_lacos;

import java.util.Scanner;

public class r3questao04 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float notas, maior = -1;

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        while(true) {
            System.out.print("Digite uma nota");
            notas = teclado.nextFloat();

            if (notas == -1)
                break;

            if(notas > maior)
                maior = notas;

            teclado.nextLine();
        }


        System.out.println("O nome do aluno é: " + nome);

        if(maior != -1)
            System.out.println(maior);
        else
            System.out.println("Nenhuma nota inserida");
    }
}
