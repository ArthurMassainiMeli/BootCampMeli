package modulo_5.dia_1.tm.parte_1;

import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos numeros pares deseja:");
        int n = entrada.nextInt();
        int value = 0;
        int count = 0;

        System.out.println("Os " + n + " primeiros numeros pares são:");
        while (true) {
            if (value % 2 == 0) {
                System.out.println(value);
                count++;
            }

            if (count == n) {
                break;
            }
            value++;
        }
    }
}
