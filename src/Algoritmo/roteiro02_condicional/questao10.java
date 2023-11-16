package Algoritmo.roteiro02_condicional;

import java.util.Scanner;
public class questao10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe sue nome: ");
        String nome = teclado.nextLine();

        System.out.print("Informe seu salario: ");
        float salario = teclado.nextFloat();
        float salarioFinal = salario;

        System.out.print("Informe seu numero de peças: ");
        int numPecas = teclado.nextInt();

        char classe;

        if(numPecas <= 30){
            classe = 'C';
        }
        else if(numPecas > 30 && numPecas <=44){
            classe = 'B';
            salarioFinal += salario * 0.05f;
        }
        else{
            classe = 'C';
            salarioFinal += salario * 0.15f;
        }

        System.out.printf(  "Funcionario: %S\n" +
                            "Salario Minimo (R$): %.2f\n" +
                            "Numero de peças fabricadas: %d\n" +
                            "Classe: %c\n" +
                            "Salario final calculado (R$): %.2f", nome, salario, numPecas, classe, salarioFinal);
    }

}
