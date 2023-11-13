package Algoritmo.roteiro03;

import java.util.Scanner;

public class r3questao03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        for(int i=1; i <= 5; i++){
            System.out.print("Nome do aluno " + i + " :");
            String nome = teclado.nextLine();

            System.out.print("Digite a primeira nota: ");
            float nota1 = teclado.nextFloat();

            System.out.print("Digite a segunda nota: ");
            float nota2 = teclado.nextFloat();

            float media = (nota1 + nota2)/2;

            System.out.printf(  "Nome do aluno: %s\n" +
                                "media do aluno: %.2f\n", nome,media);

            teclado.nextLine();
        }
    }
}
