package modulo_5.dia_2.tm;

import java.util.ArrayList;
import java.util.List;

public class MainFracao {

    public static void main(String[] args) {
        Fracao f1 = new Fracao(1.4);
        Fracao f2 = new Fracao(2.1);
        Fracao f3 = new Fracao(3.5);
        Fracao f4 = new Fracao(1.6);
        Fracao f5 = new Fracao(1.5);
        Fracao f6 = new Fracao(8.4);
        Fracao f7 = new Fracao(6.3);
        Fracao f8 = new Fracao(4.3);

        double valor1 = f1.adicionar(10);
        double valor2 = f2.adicionar(10.50);
        double valor3 = f3.subtrair(4);
        double valor4 = f4.subtrair(4.1);
        double valor5 = f5.multiplicar(2);
        double valor6 = f6.multiplicar(2.9);
        double valor7 = f7.dividir(9);
        double valor8 = f8.dividir(9.3);

        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        System.out.println(valor4);
        System.out.println(valor5);
        System.out.println(valor6);
        System.out.println(valor7);
        System.out.println(valor8);
    }
}
