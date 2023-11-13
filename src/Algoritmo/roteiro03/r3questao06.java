package Algoritmo.roteiro03;

import java.util.Scanner;

public class r3questao06 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        boolean resultado = false;

        for(int i=2; i >= 0; --i){
            System.out.print("DIgite a senha: ");
            String senha = teclado.nextLine();

            if(senha.equals("abc123")) {
                resultado = true;
                break;
            }
            System.out.println("votem agora " + i + " tentativas");
        }

        if(resultado)
            System.out.println("Parabens a senha estava certa!!!");
        else
            System.out.println("Numero de tentativas excedidas tente mais tarde!!!");
    }
}
