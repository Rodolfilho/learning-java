package Algoritmo.roteiro03;

import java.util.Scanner;

public class r3questao07 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String barra = "* * * * * * * * * * * *\n";
        int num = 0;
        while(true){
            System.out.printf(  "%s" +
                                "Teminal de atendimento\n" +
                                "BAnco do Nordeste - BNE\n %s" +
                                "1 - Saque\n" +
                                "2 - Extrato\n" +
                                "3 - Deposito\n" +
                                "4 - Tranferencia\n%s" +
                                "0 - Encerrar atendimento\n", barra, barra, barra);

            int digito = teclado.nextInt();
            String resultado = "";
            switch(digito){
                case 1:
                    resultado = "Saque";
                    break;
                case 2:
                    resultado = "Extrato";
                    break;
                case 3:
                    resultado = "Deposito";
                    break;
                case 4:
                    resultado = "Transparencia";
                    break;
                case 0:
                    resultado = "Encerra Atendimento";
                    break;

            }

            num++;


            if(resultado.equals("Encerra Atendimento")){
                System.out.println("Você escolheu a opção 0, Encerra atendimento!");
                break;
            }
            else{
                System.out.printf("Você escolheu a opção %d, %s!\n", digito, resultado);
            }

            if(num == 3){
                System.out.println("Numero de operaçoes excedida!!!");
                break;
            }

        }
    }
}