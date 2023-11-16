package Algoritmo.roteiro02_condicional;

import java.util.Scanner;
import java.util.Locale;


public class questao04 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);

        System.out.print("Digite seu peso em KG: ");
        float peso = teclado.nextFloat();

        System.out.print("Digite sua altura em metros: ");
        float altura = teclado.nextFloat();

        float imc = peso/altura;

        if(imc < 18.5)
            System.out.println("Voce esta abaixo do seu peso!");
        else if(imc >= 18.5 && imc <= 24.9)
            System.out.println("Parabens voce esta no seu peso ideal");
        else if(imc >= 25.0 && imc <= 29.9)
            System.out.println("Voce esta acima do seu peso(sobrepeso)");
        else if(imc >= 30. && imc <= 34.9)
            System.out.println("Obesidade grau I");
        else if(imc >= 35. && imc <= 39.9)
            System.out.println("Obesidade grau II");
        else
            System.out.println("Obesidade grau III");
    }
}
