package modulo_5.dia_1.tm.parte_1;

import java.util.Scanner;

public class TerceiroExercicio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero:");
        int n = entrada.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i += 1) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("O numero " + n + " é primo");
        } else {
            System.out.println("O numero " + n + " não é primo");
        }
    }
}
