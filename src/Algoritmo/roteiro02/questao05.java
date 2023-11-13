package Algoritmo.roteiro02;


import java.util.Scanner;

public class questao05{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        byte idade = teclado.nextByte();

        if(idade < 16)
            System.out.println("Não Eleitor");
        else if(idade >= 18 && idade <= 65)
            System.out.println("Eleitor Obrigaorio");
        else
            System.out.println("Eleitor facultativo");
    }
}




