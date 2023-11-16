package Algoritmo.roteiro04_array_metodos;

import java.util.Scanner;
public class R4Questao10 {
    public static void main(String[] args) {
        tipoFigura();
    }




    public static void tipoFigura() {
        String[] figuras = {"circunferencia", "triangulo", "retangulo"};
        System.out.printf(  "Escolha uma fihura:%n" +
                            "1 - circunferencia%n" +
                            "2 - triangulo%n" +
                            "3 - retangulo%n");

        Scanner input = new Scanner(System.in);
        int tipo = input.nextInt();
        float area = 0, perimetro = 0;
        if(tipo >= 1 && tipo <= 3) {
            if (tipo == 1) {
                System.out.println("Informe o raio: ");
                float raio = input.nextFloat();

                area = (float) ((raio * raio) * Math.PI);
                perimetro = (float) ((2 * raio) * Math.PI);


            } else if (tipo == 2) {
                float[] lados = new float[3];
                for (int i = 0; i < 3; i++) {
                    System.out.println("Digite o lado " + (i+1));
                    lados[i] = input.nextFloat();
                    perimetro += lados[i];
                }
                float semi = (lados[0] + lados[1] + lados[2])/3, raiz;
                raiz = semi * (semi - lados[0]) *(semi - lados[1]) * (semi - lados[2]);
                area = (float) Math.sqrt(raiz);


            } else if (tipo == 3) {

                System.out.print("Digite a altura: ");
                float altura = input.nextFloat();

                System.out.print("Digite a base: ");
                float base = input.nextFloat();

                area = base * altura;
                perimetro = (base * 2) + (altura * 2);

            }
            System.out.printf("Area igual a = %.2f%n", area);
            System.out.printf("Perimetro igual p = %.2f", perimetro);
        }
        else{
            System.out.println("valor invalido!");
        }
    }



}
