package modulo_5.dia_1.tm.parte_1;


import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos números primos deseja:");
        int n = entrada.nextInt();
        int value = 1;
        int count = 0;

        System.out.println("Os " + n + " primeiros numeros primos são:");
        while (true) {
            int countPrimo = 0;

            // verifica se o value é primo (caso countPrimo seja 2)
            for (int i = 1; i <= value; i += 1) {
                if (value % i == 0) {
                    countPrimo++;
                }
            }
            // se for primo, aumenta a contagem dos primos que o usuario digitou
            if (countPrimo == 2) {
                System.out.println(value);
                count++;
            }

            // se a contagem de primos for igual oq o usuario digitou, ele sai do while
            if (count == n) {
                break;
            }
            // acrescenta o proximo valor a ser analisado
            value++;
        }
    }
}