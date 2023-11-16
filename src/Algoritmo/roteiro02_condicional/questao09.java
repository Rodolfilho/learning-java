package Algoritmo.roteiro02_condicional;

import java.util.Scanner;
public class questao09 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Informe seu salario: ");
        float salarioInicial = teclado.nextFloat();
        float novoSalario = salarioInicial;

        if(salarioInicial <= 1000.0f)
            novoSalario += salarioInicial * 0.3f;
        else if(salarioInicial > 1000.0f && salarioInicial <=1500.f)
            novoSalario += salarioInicial * 0.2f;
        else if(salarioInicial > 1500 && salarioInicial <=2000.0f)
            novoSalario += salarioInicial * 0.15f;
        else if(salarioInicial > 2000.0f && salarioInicial <= 2500.f)
            novoSalario += salarioInicial * 0.10f;
        else
            novoSalario += salarioInicial * 0.05f;

        System.out.printf(  "O jogagor %s\n" +
                            "Seu salario Inicial era de: %.2f\n" +
                            "Seu novo salario é de: %.2f", nome, salarioInicial, novoSalario);

    }
}
