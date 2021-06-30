package modulo_5.dia_2.tm;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter(15);
        Counter counter3 = new Counter(counter1);

        System.out.println("---- Valores iniciais dos contadores ----");

        System.out.println("Counter 01 - " + counter1);
        System.out.println("Counter 02 - " + counter2);
        System.out.println("Counter 03 - " + counter3);

        System.out.println("---- Valores dos contadores apos incremento e decremento  ----");

        counter1.aumenta(100);
        counter2.aumenta(200);
        counter3.diminui(50);

        System.out.println("Counter 01 - " + counter1);
        System.out.println("Counter 02 - " + counter2);
        System.out.println("Counter 03 - " + counter3);
    }
}
