package modulo_5.dia_1.tm.parte_2;

import java.util.Arrays;
import java.util.Collections;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        Integer array[] = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        Arrays.sort(array);
        System.out.println("Ordenação crescente do array:");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Ordenação decrescente do array:");
        System.out.println(Arrays.toString(array));
    }
}
