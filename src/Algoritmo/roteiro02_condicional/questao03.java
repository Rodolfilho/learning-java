package Algoritmo.roteiro02_condicional;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua primeira nota: ");
        float nota1 = teclado.nextFloat();

        System.out.print("Digite sua segunda nota: ");
        float nota2 = teclado.nextFloat();

        System.out.print("Digite sua terceira nota: ");
        float nota3 = teclado.nextFloat();

        float media = (nota1 + nota2 + nota2)/3;
        char conceito;

        if(media >= 80)
            conceito = 'A';
        else if(media >= 50 && media <= 79)
            conceito = 'B';
        else
            conceito = 'C';

        System.out.printf("%s obteve conceito %c\n", nome, conceito);
        System.out.printf("As notas fornecidas como entrada foram %.2f %.2f e %.2f com media final %.2f", nota1, nota2, nota3, media);

    }
}

