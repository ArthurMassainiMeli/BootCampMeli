package modulo_5.dia_1.tm.parte_1;

import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numeral que deseja saber o multiplo:");
        int m = entrada.nextInt();
        System.out.println("Digite quantos multiplos desse numero deseja:");
        int n = entrada.nextInt();

        int value = 0;
        int count = 0;

        System.out.println("Os " + n + " primeiros multiplos de " + m + " são:");
        while (true) {
            if (value % m == 0) {
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
