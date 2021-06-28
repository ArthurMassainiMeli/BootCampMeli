package modulo_5.dia_1.tm.parte_1;

import java.util.Scanner;

public class QuintoExercicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero que deseja que se repita:");
        int d = entrada.nextInt();
        System.out.println("Digite quantas vezes esse numero tem que repetir:");
        int m = entrada.nextInt();
        System.out.println("Digite quantos numeros com esses valores repetidos deseja:");
        int n = entrada.nextInt();

        int value = 0;
        int count = 0;

        System.out.println("Os " + n + " primeiros numeros que o numeral" + d + " se repete " + m + " vezes são:");


        while (true) {
            int countSame = 0;

            // converte o valor para string para separar em um array
            String valueString = value + "";
            String[] parts = valueString.split("");

            // confere cada posicao desse array se é igual ao numero desejado para repetir e incrementa em countSame
            for (int j = 0; j < parts.length; j += 1) {
                if (parts[j].equals(d + "")) {
                    countSame++;
                }
            }

            // se countSame for igual a quantidade desejada de se repetir, mostra na tela
            if (countSame == m) {
                System.out.println(value);
                count++;
            }

            // se a contagem desses numeros for a que o usuario digitou, sai do while
            if (count == n) {
                break;
            }
            value++;
        }

    }
}
