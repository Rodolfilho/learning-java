package Algoritmo.roteiro02;

import java.util.Scanner;
public class questao08 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float DESPORPESSOA= 90.0f; //desconto por pessoa

        System.out.print("informe seu salario bruto: ");
        float salario = teclado.nextFloat();

        System.out.print("Informe o desconto do INSS: ");
        float inss = teclado.nextFloat();

        System.out.print("Informe o numero de Dependentes: ");
        int numDepen = teclado.nextInt(); //numero de dependentes

        float baseCalculo = (float) salario - (DESPORPESSOA * numDepen) - inss;
        float alicota, parcelaDeduzir;

        if(salario <= 900.8f){
            alicota = 1.0f;
            parcelaDeduzir = 0.0f;
        }
        else if(salario > 900.8f && salario <= 1800.5f){
            alicota = salario * 0.15f;
            parcelaDeduzir = 135.0f;
        }
        else{
            alicota = salario * 0.275f;
            parcelaDeduzir = 316.0f;
        }

        float ir = baseCalculo * alicota - parcelaDeduzir;
        System.out.println("O valor calculado do Imposto de Renda foi de: " + ir);
    }
}
